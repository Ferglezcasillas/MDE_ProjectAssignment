/**
 */
package structureAndBehaviour.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import structureAndBehaviour.BlockOfCode;
import structureAndBehaviour.StructureAndBehaviourFactory;
import structureAndBehaviour.StructureAndBehaviourPackage;

/**
 * This is the item provider adapter for a {@link structureAndBehaviour.BlockOfCode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockOfCodeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockOfCodeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS);
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
	 * This returns BlockOfCode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockOfCode"));
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
		return getString("_UI_BlockOfCode_type");
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

		switch (notification.getFeatureID(BlockOfCode.class)) {
		case StructureAndBehaviourPackage.BLOCK_OF_CODE__THINGS:
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

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.creategeneralItem()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createPrimative()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createComplex()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createConditionalStatement()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createdowhile_()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createfor_()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Output()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createNotOperation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createList()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createLogical()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createComparation()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createwhile_()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createuserDefinedFunction()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createif_()));

		newChildDescriptors.add(createChildParameter(StructureAndBehaviourPackage.Literals.BLOCK_OF_CODE__THINGS,
				StructureAndBehaviourFactory.eINSTANCE.createSystem_Input()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StructureAndBehaviourEditPlugin.INSTANCE;
	}

}
