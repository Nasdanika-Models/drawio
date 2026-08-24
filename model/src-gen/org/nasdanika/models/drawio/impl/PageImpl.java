/**
 */
package org.nasdanika.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.drawio.DrawioPackage;
import org.nasdanika.models.drawio.Page;

import org.nasdanika.models.presentation.impl.SlideImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.drawio.impl.PageImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link org.nasdanika.models.drawio.impl.PageImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link org.nasdanika.models.drawio.impl.PageImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.nasdanika.models.drawio.impl.PageImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.nasdanika.models.drawio.impl.PageImpl#getGridSize <em>Grid Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends SlideImpl implements Page {
	/**
	 * The default value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected static final double DX_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected static final double DY_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double PAGE_WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double PAGE_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getGridSize() <em>Grid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSize()
	 * @generated
	 * @ordered
	 */
	protected static final double GRID_SIZE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDx() {
		return (Double)eDynamicGet(DrawioPackage.PAGE__DX, DrawioPackage.Literals.PAGE__DX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDx(double newDx) {
		eDynamicSet(DrawioPackage.PAGE__DX, DrawioPackage.Literals.PAGE__DX, newDx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDy() {
		return (Double)eDynamicGet(DrawioPackage.PAGE__DY, DrawioPackage.Literals.PAGE__DY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDy(double newDy) {
		eDynamicSet(DrawioPackage.PAGE__DY, DrawioPackage.Literals.PAGE__DY, newDy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPageWidth() {
		return (Double)eDynamicGet(DrawioPackage.PAGE__PAGE_WIDTH, DrawioPackage.Literals.PAGE__PAGE_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(double newPageWidth) {
		eDynamicSet(DrawioPackage.PAGE__PAGE_WIDTH, DrawioPackage.Literals.PAGE__PAGE_WIDTH, newPageWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPageHeight() {
		return (Double)eDynamicGet(DrawioPackage.PAGE__PAGE_HEIGHT, DrawioPackage.Literals.PAGE__PAGE_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(double newPageHeight) {
		eDynamicSet(DrawioPackage.PAGE__PAGE_HEIGHT, DrawioPackage.Literals.PAGE__PAGE_HEIGHT, newPageHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGridSize() {
		return (Double)eDynamicGet(DrawioPackage.PAGE__GRID_SIZE, DrawioPackage.Literals.PAGE__GRID_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSize(double newGridSize) {
		eDynamicSet(DrawioPackage.PAGE__GRID_SIZE, DrawioPackage.Literals.PAGE__GRID_SIZE, newGridSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.PAGE__DX:
				return getDx();
			case DrawioPackage.PAGE__DY:
				return getDy();
			case DrawioPackage.PAGE__PAGE_WIDTH:
				return getPageWidth();
			case DrawioPackage.PAGE__PAGE_HEIGHT:
				return getPageHeight();
			case DrawioPackage.PAGE__GRID_SIZE:
				return getGridSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrawioPackage.PAGE__DX:
				setDx((Double)newValue);
				return;
			case DrawioPackage.PAGE__DY:
				setDy((Double)newValue);
				return;
			case DrawioPackage.PAGE__PAGE_WIDTH:
				setPageWidth((Double)newValue);
				return;
			case DrawioPackage.PAGE__PAGE_HEIGHT:
				setPageHeight((Double)newValue);
				return;
			case DrawioPackage.PAGE__GRID_SIZE:
				setGridSize((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DrawioPackage.PAGE__DX:
				setDx(DX_EDEFAULT);
				return;
			case DrawioPackage.PAGE__DY:
				setDy(DY_EDEFAULT);
				return;
			case DrawioPackage.PAGE__PAGE_WIDTH:
				setPageWidth(PAGE_WIDTH_EDEFAULT);
				return;
			case DrawioPackage.PAGE__PAGE_HEIGHT:
				setPageHeight(PAGE_HEIGHT_EDEFAULT);
				return;
			case DrawioPackage.PAGE__GRID_SIZE:
				setGridSize(GRID_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DrawioPackage.PAGE__DX:
				return getDx() != DX_EDEFAULT;
			case DrawioPackage.PAGE__DY:
				return getDy() != DY_EDEFAULT;
			case DrawioPackage.PAGE__PAGE_WIDTH:
				return getPageWidth() != PAGE_WIDTH_EDEFAULT;
			case DrawioPackage.PAGE__PAGE_HEIGHT:
				return getPageHeight() != PAGE_HEIGHT_EDEFAULT;
			case DrawioPackage.PAGE__GRID_SIZE:
				return getGridSize() != GRID_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
