/**
 */
package structureAndBehaviour.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import structureAndBehaviour.Operation;
import structureAndBehaviour.StructureAndBehaviourFactory;
import structureAndBehaviour.StructureAndBehaviourPackage;

/**
 * This is the item provider adapter for a {@link structureAndBehaviour.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT);
			childrenFeatures.add(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Operation_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operation.class)) {
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createPrimative()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createComplex()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Output()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createNotOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createList()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createLogical()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createComparation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createuserDefinedFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Input()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createPrimative()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createComplex()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Output()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createNotOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createList()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createLogical()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createComparation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createuserDefinedFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Input()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == StructureAndBehaviourPackage.Literals.OPERATION__RIGHT_INPUT
				|| childFeature == StructureAndBehaviourPackage.Literals.OPERATION__LEFT_INPUT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
