/**
 */
package org.nasdanika.models.drawio.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.diagram.Connectable;
import org.nasdanika.models.diagram.Diagram;
import org.nasdanika.models.diagram.DiagramElement;

import org.nasdanika.models.drawio.*;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.presentation.Presentation;
import org.nasdanika.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.drawio.DrawioPackage
 * @generated
 */
public class DrawioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DrawioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DrawioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrawioSwitch<Adapter> modelSwitch =
		new DrawioSwitch<Adapter>() {
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseLinkTarget(LinkTarget object) {
				return createLinkTargetAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseAbstractLink(AbstractLink object) {
				return createAbstractLinkAdapter();
			}
			@Override
			public Adapter caseSimpleLink(SimpleLink object) {
				return createSimpleLinkAdapter();
			}
			@Override
			public Adapter caseCustomLink(CustomLink object) {
				return createCustomLinkAdapter();
			}
			@Override
			public Adapter caseSpelLink(SpelLink object) {
				return createSpelLinkAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter caseAnimation(Animation object) {
				return createAnimationAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseTargetedAction(TargetedAction object) {
				return createTargetedActionAdapter();
			}
			@Override
			public Adapter casePersistableAction(PersistableAction object) {
				return createPersistableActionAdapter();
			}
			@Override
			public Adapter caseShow(Show object) {
				return createShowAdapter();
			}
			@Override
			public Adapter caseHide(Hide object) {
				return createHideAdapter();
			}
			@Override
			public Adapter caseToggle(Toggle object) {
				return createToggleAdapter();
			}
			@Override
			public Adapter caseSetOpacity(SetOpacity object) {
				return createSetOpacityAdapter();
			}
			@Override
			public Adapter caseTransitionEffect(TransitionEffect object) {
				return createTransitionEffectAdapter();
			}
			@Override
			public Adapter caseFadeIn(FadeIn object) {
				return createFadeInAdapter();
			}
			@Override
			public Adapter caseFadeOut(FadeOut object) {
				return createFadeOutAdapter();
			}
			@Override
			public Adapter caseFadeTo(FadeTo object) {
				return createFadeToAdapter();
			}
			@Override
			public Adapter caseWipeIn(WipeIn object) {
				return createWipeInAdapter();
			}
			@Override
			public Adapter caseWipeOut(WipeOut object) {
				return createWipeOutAdapter();
			}
			@Override
			public Adapter casePopIn(PopIn object) {
				return createPopInAdapter();
			}
			@Override
			public Adapter casePopOut(PopOut object) {
				return createPopOutAdapter();
			}
			@Override
			public Adapter caseSetStyle(SetStyle object) {
				return createSetStyleAdapter();
			}
			@Override
			public Adapter caseToggleStyle(ToggleStyle object) {
				return createToggleStyleAdapter();
			}
			@Override
			public Adapter caseHighlight(Highlight object) {
				return createHighlightAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseScroll(Scroll object) {
				return createScrollAdapter();
			}
			@Override
			public Adapter caseViewbox(Viewbox object) {
				return createViewboxAdapter();
			}
			@Override
			public Adapter caseOpen(Open object) {
				return createOpenAdapter();
			}
			@Override
			public Adapter caseTagsAction(TagsAction object) {
				return createTagsActionAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseStringIdentity(StringIdentity object) {
				return createStringIdentityAdapter();
			}
			@Override
			public Adapter caseDocumented(Documented object) {
				return createDocumentedAdapter();
			}
			@Override
			public Adapter caseMarked(Marked object) {
				return createMarkedAdapter();
			}
			@Override
			public Adapter caseNxcore_ModelElement(org.nasdanika.models.nxcore.ModelElement object) {
				return createNxcore_ModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter casePresentation(Presentation object) {
				return createPresentationAdapter();
			}
			@Override
			public Adapter caseSlide(Slide object) {
				return createSlideAdapter();
			}
			@Override
			public Adapter caseDiagram_Layer(org.nasdanika.models.diagram.Layer object) {
				return createDiagram_LayerAdapter();
			}
			@Override
			public Adapter caseConnectable(Connectable object) {
				return createConnectableAdapter();
			}
			@Override
			public Adapter caseDiagram_Node(org.nasdanika.models.diagram.Node object) {
				return createDiagram_NodeAdapter();
			}
			@Override
			public Adapter caseDiagram_Connection(org.nasdanika.models.diagram.Connection object) {
				return createDiagram_ConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.LinkTarget <em>Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.LinkTarget
	 * @generated
	 */
	public Adapter createLinkTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.AbstractLink <em>Abstract Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.AbstractLink
	 * @generated
	 */
	public Adapter createAbstractLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.SimpleLink <em>Simple Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.SimpleLink
	 * @generated
	 */
	public Adapter createSimpleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.CustomLink <em>Custom Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.CustomLink
	 * @generated
	 */
	public Adapter createCustomLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.SpelLink <em>Spel Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.SpelLink
	 * @generated
	 */
	public Adapter createSpelLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Animation
	 * @generated
	 */
	public Adapter createAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.TargetedAction <em>Targeted Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.TargetedAction
	 * @generated
	 */
	public Adapter createTargetedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.PersistableAction <em>Persistable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.PersistableAction
	 * @generated
	 */
	public Adapter createPersistableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Show
	 * @generated
	 */
	public Adapter createShowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Hide
	 * @generated
	 */
	public Adapter createHideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Toggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Toggle
	 * @generated
	 */
	public Adapter createToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.SetOpacity <em>Set Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.SetOpacity
	 * @generated
	 */
	public Adapter createSetOpacityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.TransitionEffect <em>Transition Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.TransitionEffect
	 * @generated
	 */
	public Adapter createTransitionEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.FadeIn
	 * @generated
	 */
	public Adapter createFadeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.FadeOut
	 * @generated
	 */
	public Adapter createFadeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.FadeTo <em>Fade To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.FadeTo
	 * @generated
	 */
	public Adapter createFadeToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.WipeIn <em>Wipe In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.WipeIn
	 * @generated
	 */
	public Adapter createWipeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.WipeOut <em>Wipe Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.WipeOut
	 * @generated
	 */
	public Adapter createWipeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.PopIn <em>Pop In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.PopIn
	 * @generated
	 */
	public Adapter createPopInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.PopOut <em>Pop Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.PopOut
	 * @generated
	 */
	public Adapter createPopOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.SetStyle <em>Set Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.SetStyle
	 * @generated
	 */
	public Adapter createSetStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.ToggleStyle <em>Toggle Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.ToggleStyle
	 * @generated
	 */
	public Adapter createToggleStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Highlight <em>Highlight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Highlight
	 * @generated
	 */
	public Adapter createHighlightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Scroll <em>Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Scroll
	 * @generated
	 */
	public Adapter createScrollAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Viewbox <em>Viewbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Viewbox
	 * @generated
	 */
	public Adapter createViewboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.Open
	 * @generated
	 */
	public Adapter createOpenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.drawio.TagsAction <em>Tags Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.drawio.TagsAction
	 * @generated
	 */
	public Adapter createTagsActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.StringIdentity
	 * @generated
	 */
	public Adapter createStringIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.Documented
	 * @generated
	 */
	public Adapter createDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.Marked
	 * @generated
	 */
	public Adapter createMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.ModelElement
	 * @generated
	 */
	public Adapter createNxcore_ModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.nxcore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.nxcore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.DiagramElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.presentation.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.presentation.Presentation
	 * @generated
	 */
	public Adapter createPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.presentation.Slide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.presentation.Slide
	 * @generated
	 */
	public Adapter createSlideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.Layer
	 * @generated
	 */
	public Adapter createDiagram_LayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.Connectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.Connectable
	 * @generated
	 */
	public Adapter createConnectableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.Node
	 * @generated
	 */
	public Adapter createDiagram_NodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.diagram.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.diagram.Connection
	 * @generated
	 */
	public Adapter createDiagram_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DrawioAdapterFactory
