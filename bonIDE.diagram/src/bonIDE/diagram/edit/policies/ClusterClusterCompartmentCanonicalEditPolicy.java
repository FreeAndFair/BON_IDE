package bonIDE.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClusterClusterCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = bonIDE.diagram.part.BonideDiagramUpdater.getClusterClusterCompartment_7001SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((bonIDE.diagram.part.BonideNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = bonIDE.diagram.part.BonideVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case bonIDE.diagram.edit.parts.Cluster2EditPart.VISUAL_ID:
		case bonIDE.diagram.edit.parts.BONClass2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(bonIDE.BonIDEPackage.eINSTANCE.getCluster_Contents());
		}
		return myFeaturesToSynchronize;
	}

}
