
```drawio-resource
../drawio.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) model of **Draw.io diagrams as data**: pages, layers, nodes, connections, the custom properties, the tags, the links, the connection points that decide where an arrow lands - and the style string, turned into an object instead of kept as a substring.

It is the Ecore face of the [Nasdanika Core Draw.io](https://docs.nasdanika.org/core/drawio/index.html) Java API, which has been reading, writing, executing, and mapping `.drawio` files for years.
That API keeps doing the loading and the saving - compressed and uncompressed XML, PNG metadata, HTML embedding, page and element links, URI handlers - and this model is what it loads into.
Nothing about the file format is re-implemented here; what is added is EMF: resource sets, cross-resource references, XMI/JSON/YAML persistence, [EMF Compare](https://eclipse.dev/emf/compare/), validation, and - the part that changes the arithmetic - **shared supertypes with every other notation in the family**.

It sits on the [presentation](https://presentation.models.nasdanika.org/) floor, which sits on [diagram](https://diagram.models.nasdanika.org/), which is a rooftop on the [C4](https://c4.models.nasdanika.org/) floor of the [Nasdanika model tower](https://nasdanika.com/models.html).
A page is a slide is a diagram: [`DrawioDocument`](references/eClassifiers/DrawioDocument/index.html) extends presentation `Presentation`, [`Page`](references/eClassifiers/Page/index.html) extends `Slide`, and nodes and connections extend their diagram namesakes.
Which means this model holds only what makes Draw.io *Draw.io*, and inherits the rest.

The traffic runs in both directions, and that is the interesting part.
Draw.io is where most of the Nasdanika diagram ideas were proven - [executable diagrams](https://docs.nasdanika.org/core/drawio/index.html), [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html), documentation site generation, magic properties, cross-document diagram networks - and the [book](https://leanpub.com/beyond-diagrams) about them is a Draw.io book.
None of that was ever really about mxGraph.
Moving it down onto shared supertypes turns each of those features into a family feature - an executable PowerPoint is the same interpreter with a different loader - and the return trip brings Draw.io things it never had: [ELK](https://elk.models.nasdanika.org/) layout written once for all notations, three-way merge, and generation pipelines that emit a `.drawio` for the wiki and a `.pptx` for the meeting from one model.

## The thesis

**The style string is the whole Draw.io modeling problem in miniature.**
A shape's appearance, and a fair amount of its meaning, live in one attribute: `rounded=1;fillColor=#dae8fc;strokeColor=#6c8ebf;html=1;` - or `shape=mxgraph.aws4.lambda_function;`, which is often the only place the diagram says what the box *is*.
A model that keeps that as a `String` has modeled nothing: `fillColor` is not queryable, not settable without string surgery, not comparable, and not validatable.
Here a diagram element carries a **derived, read-only `style` reference to a `Style` object backed by the element's properties**.
`Style` does not *extend* a map, it *contains* one: an `EMap` of raw key/value entries, so nothing is ever lost - unknown keys are preserved rather than dropped, because a model that silently discards `sketch=1` is a model nobody will run twice - and alongside it sit typed features for the keys worth naming.
`NodeStyle` and `ConnectionStyle` specialize it, and enumerations cover the closed vocabularies: arrow shapes, line styles, jump styles.
Derived and read-only means there is exactly one copy of the truth: the properties are the state, the style object is a view over them, and writing through the view updates the element it came from.

Containment rather than inheritance is the one place this model deliberately departs from the Java API, whose `Style`, `NodeStyle`, `LineStyle`, and `ConnectionStyle` interfaces extend `Map<String,String>` directly.
An `EClass` cannot usefully extend `Map`, and would not want to.
Composing the map lets the typed features, the enumerations, the documentation, and the validation constraints sit next to the raw entries instead of being crowded out by them, and it makes a style an addressable model element in its own right - something OCL, SpEL, [EMF Compare](https://eclipse.dev/emf/compare/), and generic tooling can reason about, rather than a string they each have to parse.

**The Java API stays; this model is not a replacement for it.**
The API is mature, it round-trips, and it knows the format's quirks - the page/model/root triple that is logically one thing, deflate-plus-base64 compression, diagrams embedded in PNG metadata, the `<object>` wrapper that appears the moment a shape gets a custom property.
Re-deriving all of that in a loader would be a step backwards.
What a plain Java object tree cannot do is participate in a resource set, be referenced from another model, be diffed by a standard tool, or share a type hierarchy with a Visio drawing.
So the division is deliberate: **the API is the loader and the serializer, the model is the resource** - and the [capability framework](https://docs.nasdanika.org/core/capability/index.html) wires the two together, so a `.drawio` URI in a resource set resolves to a model without anybody writing glue.

**Everything interesting about Draw.io here was already generic; nobody had said so out loud.**
Executable diagrams, semantic mapping, site generation, geometric comparators, layout - each was written against Draw.io because Draw.io is where the diagrams were, not because any of it depends on mxGraph.
[ELK](https://elk.models.nasdanika.org/) layout is the cleanest example, and the current state of the code proves the point: `DrawioElkGraphFactory` builds an ELK graph out of `org.nasdanika.drawio.Page`, `Node`, `Connection`, and `ConnectionPoint`, so every other notation that wants automatic layout needs its own copy of it.
Written against the [diagram](https://diagram.models.nasdanika.org/) model instead, it is one factory, and PowerPoint, Visio, ODP, PlantUML, and Sprotty get layout without a line of new code.
Draw.io loses nothing, and the family gains a feature it would otherwise have built five times.

**What stays Draw.io-specific is small, and worth naming precisely.**
The style vocabulary, and the `Style` hierarchy that types it.
The custom properties on the `<object>` wrapper.
Tags, which the in-browser viewer filters by, so a generated diagram is interactive with no tooling at all.
The link URI vocabulary - `data:page,`, `data:page/name,`, `data:element/id,` - which turns a folder of files into a navigable network of diagrams.
Exit and entry style attributes, which are connection points by another name.
Compression, PNG embedding, page geometry, and grid.
That is roughly a dozen things. Everything else a Draw.io diagram has, a Visio drawing and a PowerPoint deck also have, and it belongs on the floors below.

**Fidelity to the format, not to the pixels.**
A `.drawio` file loaded and saved through this model should open in the editor unchanged, because Draw.io is the tool people will keep using and a model that scrambles their file is worthless to them.
A Visio drawing converted *into* Draw.io through this model will not be pixel-identical to the original, and is not trying to be.

## Position in the tower

A **notation model on the [presentation](https://presentation.models.nasdanika.org/) floor**, and the most load-bearing one, because Draw.io is the only member of the family that is simultaneously a format, a free editor, and a viewer.
Standing where it does, the whole tower is beneath it: [architecture](https://architecture.models.nasdanika.org/), [threat](https://threat.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), and [nxcore](https://nxcore.models.nasdanika.org/).
A box on a `.drawio` page can depict a system, carry its own documentation and owner, be staged, be governed, and be traced back to the file, branch, and commit it was loaded from.

### Why Draw.io is the family's default surface

The other notation models are formats. Draw.io is a format plus a tool everybody can already open, which is a different kind of asset:

* **Free and open source**, on the web, Linux, macOS, and Windows, as a [VS Code extension](https://marketplace.visualstudio.com/items?itemName=hediet.vscode-drawio) and a Confluence plugin, and [self-hostable](https://hub.docker.com/r/jgraph/drawio) as a WAR or a container - which matters in exactly the enterprises that will not approve a new modeling tool.
* **More than two thousand built-in shapes**, plus the AWS, Azure, and GCP icon sets and anything pasted in - so a diagram that means something specific looks like it means something specific.
* **An in-browser viewer** that toggles layers, filters by tags, goes full screen, and hands off to the editor - so a generated documentation site gets interactivity for free instead of shipping PNGs with image maps.
* **Properties, tooltips, custom libraries, and templates**, all editable by a subject-matter expert who has never heard of Ecore.

That last point is the whole on-ramp: a diagram can be drawn by one person and mapped to a domain model by another, later, without redrawing anything.
The alternative - introduce a modeling tool, train the modelers, then train the readers - is where most modeling initiatives die.

### What this model adds to presentation

Presentation supplies the deck, the slides, the shapes, the text tree, the masters, and the connectors; diagram supplies identity, documentation, `properties`, `tags`, `semanticElements`, bounds, ports, layers, and the containment tree.
What is left is genuinely Draw.io:

* **Style as an object.** A derived, read-only `style` reference on a common `ModelElement` supertype, so nodes, connections, and layers all have one - returning a `Style` backed by the element's properties, specialized as `NodeStyle` and `ConnectionStyle`, with a contained `EMap` of raw entries underneath and enumerations for arrow, line, and jump styles.
* **mxGraph document facts.** `host`, `agent`, `version`, and `compressed` on [`DrawioDocument`](references/eClassifiers/DrawioDocument/index.html); `dx`, `dy`, `pageWidth`, `pageHeight`, and `gridSize` on [`Page`](references/eClassifiers/Page/index.html) - the attributes that decide whether a saved file opens the way its author left it.
* **Connection points.** A `ConnectionPoint` extending diagram `Port` with pixel `dx`/`dy` offsets, which is what `exitX`/`exitY`/`entryX`/`entryY` actually are - so an arrow anchored to the left edge of a box is still anchored there after a conversion, instead of snapping to the centre.
* **Links as model references.** Draw.io links are strings; in a resource set they resolve into real references to other pages and other elements in other documents, which is the difference between a folder of diagrams and one federated model.

### The reciprocity

Worth stating as an exchange, because it is the reason the model is being moved rather than left alone.

**Draw.io gives the family**: the executable-diagram interpreter, the semantic mapping approach and its property vocabulary, the site generation pipeline and its [template](https://github.com/Nasdanika-Templates/drawio-site), the magic-property interpolation syntax, the cross-document link vocabulary, the geometric comparators that read layout as ordering, and years of accumulated pragmatics about what a diagram file actually contains.

**The family gives Draw.io**: ELK and force-directed layout as a shared service, three-way merge with a Git merge driver, format-independent generation, a route in from Visio and PowerPoint estates, and every domain model in the tower as a legitimate target for `semanticElements`.

## Competitive landscape

**Draw.io itself, and mxGraph.**
The source, not the rival, and the tool this model exists to keep people using.
Draw.io has a JavaScript object model that lives in the browser inside the editor and evaporates when the tab closes; server-side there is a file, and `Extras > Edit Diagram` for the brave.
Its extension story - plugins, custom shape libraries, templates - is extension *inside the editor*.
Nothing in it addresses what happens when a thousand diagrams need to be queried, validated, generated, merged, or connected to an architecture model, because that was never its job.

**`.drawio` parsers and one-off converters.**
Scripts that inflate the XML and walk it, the `drawio` CLI's export modes, Confluence macros, assorted drawio-to-Mermaid and drawio-to-image utilities.
Each solves one direction of one problem and produces a parse tree that exists for a few milliseconds.
None of them round-trips, none has a concept of the domain element a shape stands for, and none survives contact with the `<object>` wrapper, page links, or a style key it has not seen before.

**Diagram-as-code: Mermaid, PlantUML, D2, Graphviz, Structurizr DSL.**
Text-first, version-controllable, and genuinely good - which is why [PlantUML](https://plantuml.models.nasdanika.org/) is a family member here rather than a competitor.
Their limit is that the source *is* the artifact: no object graph to query, no stable identity to reference from a risk register, and cross-diagram references are string matching.
And they are not authoring surfaces for the people who own the content - an SME will draw a box, and will not learn a DSL.

**Structurizr** deserves separate mention as the closest philosophical relative: a model with views generated from it, rather than drawings.
The disagreements are direction and scope.
Structurizr is model-first and C4-shaped, with diagrams as output; this model is diagram-first with mapping as an optional upgrade, on a tower that goes well past C4 into threat, work, governance, and lifecycle.
And the editor here is Draw.io, which the organization already has, rather than a DSL plus a renderer.

**Eclipse modeling: GMF `notation.ecore`, Sirius, Graphiti, GLSP.**
The closest technical relatives, and the [diagram model](https://diagram.models.nasdanika.org/) carries the full comparison.
The short version: those are the persistence formats of diagram *editors*, bound to their runtimes, and a notation element without its semantic element is an orphan.
Here there is no editor to build or adopt - the editor is Draw.io - and an unmapped element is a first-class documented element.

**Visio, Lucidchart, Miro, and the rest of the canvas market.**
Sources and migration origins rather than rivals - see the [presentation model](https://presentation.models.nasdanika.org/) for the Visio case, which is the one enterprises have at scale.
Draw.io is usually the destination in those conversions, and this model is what makes the destination worth arriving at.

**The actual competitor**, as everywhere else in the tower: a `.drawio` file committed to a repository that nothing parses, a PNG exported into a wiki page, and an architecture diagram that was accurate on the day it was drawn.

## What a typed model adds

**Style becomes queryable.**
"Every node with `fillColor=#d5e8d4`", "every connection that is not orthogonal", "every shape still using a retired icon set" - queries rather than regular expressions over XML.
The keys worth naming are typed features on `NodeStyle` and `ConnectionStyle`, with enumerations behind the closed ones, so an arrow, line, or jump style is a value an editor can complete and a validator can reject - while everything else stays available as raw entries in the contained map, which is what keeps the round trip honest.
Restyling an estate to a new palette, or onto a corporate template, becomes a model transformation instead of a person opening files.

**Custom properties are where the meaning already is.**
The `<object>` wrapper's properties load into diagram `properties`, and that string-to-string map is the carrier for everything: [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) configuration, processor URIs for [executable diagrams](https://docs.nasdanika.org/core/drawio/index.html), site-generation hints such as `doc-ref`, `icon`, `role`, and `sort-key`, and whatever a team invents next.
Supporting a new interpreter is loader and capability work, not a metamodel release.

**Magic properties keep working, and become inspectable.**
`$style:fillColor` and `$spel:` interpolation let a property value be computed from the element it sits on.
On a model, the inputs and the outputs of that interpolation are both addressable, so a diagram whose properties are half-computed can be debugged rather than guessed at.

**Links become navigable references.**
`data:page/name,my-system.drawio#My+Component` and `data:element/id,...` are strings in the file and real cross-resource references in a resource set - including through URI handlers such as `maven://` and `gitlab://`, which means a diagram can link into a diagram that was never checked out.
A network of diagrams maintained by several teams becomes one traversable object graph, and "what links to this component" is a `getReferrers` query.

**Tags and layers are meaning, not decoration.**
The viewer filters by tag and toggles layers with no server involved, so one generated diagram serves several audiences: the future-state layer, the out-of-scope layer, the per-domain tag.
As data, the same tags drive queries and generation.

**Provenance and identity.**
nxcore `Marked` gives every element `markers`, so a shape traces back to its file, page, branch, and commit; `id` and `uris` give it the stable identity that three-way merge and regeneration need in order to recognise an element as *the same* element rather than as a deletion plus an addition.

**Semantics, optional throughout.**
`semanticElements` reaches from a box on a page into [architecture](https://architecture.models.nasdanika.org/), [threat](https://threat.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), or anything else in the tower - and where nothing is mapped, the element still carries its own name, documentation, owner, and stage.
The [diagram model](https://diagram.models.nasdanika.org/) calls this a ramp rather than a switch; Draw.io is where teams get on it.

## Applications

**Documentation sites from diagrams.**
The flagship, and the one with the most mileage on it: point the [Nasdanika CLI](https://docs.nasdanika.org/) at a `.drawio` file and get a navigable, searchable web site - every shape a page, every connection a link, tooltips and documentation attached, and the diagram itself embedded and interactive.
The [drawio-site template](https://github.com/Nasdanika-Templates/drawio-site) is a good starting point, driven by a GitHub Action and a handful of element properties.
On this model the pipeline stops being Draw.io-specific: the same generator runs over a Visio drawing or a PowerPoint deck, and Draw.io authors keep the site their format has always produced.

**Executable diagrams, and executable PowerPoints.**
Elements carry processor URIs, the graph is wired into Java processors through the [Graph](https://github.com/Nasdanika-Models/graph) module, and the picture runs - see [Executable (computational) graphs and diagrams](https://medium.com/nasdanika/executable-computational-graphs-diagrams-1eeffc80976d).
Lifting the interpreter onto shared supertypes means it stops being Draw.io-specific, which is what makes an executable deck a straight-faced proposition: slides as pages, shapes as processors, connectors as message paths, and the deck stays a deck a business audience can open.
Draw.io remains the natural place to *author* one, because it is the only member of the family that is also a decent graph editor.

**Semantic mapping onto the tower.**
Map diagram elements to domain model elements through properties - creation, references, attributes, operations, with geometric comparators treating position as meaning.
The direction is deliberately the reverse of the usual one: instead of generating pictures from a model, existing pictures acquire semantics.
That suits the cases that actually occur - a large body of pre-existing diagrams, an environment where Draw.io is available and a new tool is not, a problem domain that is not settled yet - and it lets modeling and mapping be done by different people at different times.

**High-level design to low-level design to implementation.**
Draw the high-level design, generate the low-level design documentation site from it, then either generate code from the diagram or run the diagram directly.
One artifact, three altitudes, and no divergence between them because there is only one source.

**Layout as a service.**
[ELK](https://elk.models.nasdanika.org/) hierarchical layout, force-directed placement, and the simple non-overlap arrangement of `Util.layout()` - applied to generated diagrams so they open readable rather than as a pile of boxes at the origin, and to merged diagrams so a regeneration does not need an hour of tidying afterwards.
See [Beyond Human Layout: How ELK + Draw.io Unlock a New Era of Visual Understanding](https://medium.com/nasdanika/draw-io-elk-eclipse-layout-kernel-93bc6879fc16).
Moving the ELK factory down onto the diagram model is what makes this one implementation instead of one per notation.

**Regeneration without flattening human work.**
The failure mode of every generated diagram is the second run: somebody grouped the boxes that belong to one team, annotated the connection that matters, moved a cluster where it reads better - and the next generation destroys all of it.
Three-way merge on the model - previous generation as base, fresh generation as one side, edited drawing as the other - keeps both, and delivered as a Git merge driver it makes `git merge` do something sensible with a compressed XML file that has no line structure worth diffing.
The [diagram model](https://diagram.models.nasdanika.org/) carries the full treatment, including rendering conflicts as shapes on their own layer so they are settled in Draw.io rather than in a text editor.

**Migration destination.**
Visio estates, Lucidchart exports, and decks converted through the shared models land here, because Draw.io is where organizations want them: free to read, editable in Confluence and VS Code, and diffable in a repository.
What arrives is not merely a different file extension - it is the first time the estate has been queryable.

**Reporting and living diagrams.**
Draw a diagram of a system, a business, or a programme, generate the site, then enrich the elements with status pulled from issue trackers and monitoring - implementation status, health, ownership, open work.
With a computed `semanticElements` selector the shape stops being a snapshot and becomes a standing question, which is the honest fix for diagrams that are accurate once and misleading afterwards.

**AI-generated and AI-read diagrams.**
A small typed model is a far better contract for a language model than mxGraph XML: emit or read a documented structure, validate that it is structurally sound and that every shape depicts an approved element, then render.
This already works from the other end - a photograph of a whiteboard, handed to a coding agent, comes back as a `.drawio` file, which then generates a site.
See [agent](https://agent.models.nasdanika.org/) and [AI governance](https://ai.governance.models.nasdanika.org/) for the surrounding machinery.

## Model overview

| Area | Types |
|------|-------|
| Document | [DrawioDocument](references/eClassifiers/DrawioDocument/index.html) (extends presentation `Presentation`) - `host`, `agent`, `version`, `compressed` |
| Pages | [Page](references/eClassifiers/Page/index.html) (extends presentation `Slide`, and therefore diagram `Diagram`) - `dx`, `dy`, `pageWidth`, `pageHeight`, `gridSize` |
| Layer elements | [DrawioLayer](references/eClassifiers/DrawioLayer/index.html), [DrawioNode](references/eClassifiers/DrawioNode/index.html) (`label`, `collapsed`), [DrawioConnection](references/eClassifiers/DrawioConnection/index.html) |
| Style | `Style` - a contained `EMap` of raw entries plus typed features; `NodeStyle` and `ConnectionStyle` specializations; enumerations for arrow, line, and jump styles; reached through a derived read-only `style` reference on `ModelElement`, backed by the element's properties |
| Draw.io specifics | custom `<object>` properties loaded into diagram `properties`; tags; link URIs |
| Reused, not redefined | presentation `Presentation`, `Slide`, `Shape`, `ConnectorShape`, text tree, masters, notes; diagram `DiagramElement` (`tags`, `properties`, `semanticElements`, `children` keyed by `id`), `Node` bounds and ports, `Layer`, `Connection`; nxcore identity, documentation, `uris`, `icon`, and markers |
| Provided by the Java API, not the model | parsing and serialization, compression, PNG metadata, HTML embedding, page and element link resolution, URI handlers, layout, comparators |
| In progress | the `ModelElement` supertype with its derived `style` reference, and the `Style` / `NodeStyle` / `ConnectionStyle` hierarchy with its enumerations; `ConnectionPoint` extending diagram `Port` with pixel `dx`/`dy` for `exitX`/`exitY`/`entryX`/`entryY`; capability wiring so a `.drawio` URI resolves to a model in a resource set; migration of the site generator, the executable-diagram interpreter, and the ELK factory down onto the shared models |

## Relation to other Nasdanika work

**The module below.** [Nasdanika Core Draw.io](https://docs.nasdanika.org/core/drawio/index.html) is the Java API this model is the Ecore face of - `Document`, `Page`, `Model`, `Root`, `Layer`, `Node`, `Connection`, the `Style` map interfaces, the selector syntax, the comparators, and the linking vocabulary.
It is built on [Graph](https://github.com/Nasdanika-Models/graph), which is where executable diagrams get their processors.

**The floors below.** [Presentation](https://presentation.models.nasdanika.org/) supplies the deck and slide vocabulary, [diagram](https://diagram.models.nasdanika.org/) supplies the notation vocabulary and the depiction link, and through them the [C4](https://c4.models.nasdanika.org/) floor and everything under it.

**The siblings.** [Visio](https://visio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [PlantUML](https://plantuml.models.nasdanika.org/), [ODP](https://odp.models.nasdanika.org/), [PDF](https://pdf.models.nasdanika.org/), and [Sprotty](https://sprotty.models.nasdanika.org/) - each a loader and a generator over the shared models rather than a metamodel with ambitions of its own.

**Adjacent models.** [ELK](https://elk.models.nasdanika.org/) for layout, [Markdown](https://markdown.models.nasdanika.org/) as the other authoring surface, [architecture](https://architecture.models.nasdanika.org/) and [C4](https://c4.models.nasdanika.org/) as the usual mapping targets, [flow](https://flow.models.nasdanika.org/) and [function flow](https://function-flow.models.nasdanika.org/) for the process-diagram cases, and [ECharts](https://github.com/Nasdanika-Models/echarts) for the charting side of the same "picture as data" idea.

**Templates.** [drawio-site](https://github.com/Nasdanika-Templates/drawio-site) - a repository, a GitHub Action, and a `.drawio` file that publishes itself as a documentation site, with nothing to install.

**Writing.** [Beyond Diagrams](https://leanpub.com/beyond-diagrams) is the book-length treatment: capturing thoughts in diagrams, generating documentation, making diagrams executable, mapping them to a problem domain, and federating them into a web of diagrams.
The [Nasdanika Medium publication](https://medium.com/nasdanika/all) carries the shorter pieces.

**Tooling.** Models are loaded from their native formats, authored in [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON, wired through the [capability framework](https://docs.nasdanika.org/core/capability/index.html), transformed with [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) or [NSML](https://github.com/Nasdanika/nasdanika-semantic-mapping-language), and documented with the generation stack that built this site.

## Resources

* [Nasdanika Models](https://nasdanika.com/models.html)
* [Nasdanika Core Draw.io](https://docs.nasdanika.org/core/drawio/index.html)
* [docs.nasdanika.org](https://docs.nasdanika.org/index.html)
* [Beyond Diagrams](https://leanpub.com/beyond-diagrams)
* [Nasdanika Medium publication](https://medium.com/nasdanika/all)
