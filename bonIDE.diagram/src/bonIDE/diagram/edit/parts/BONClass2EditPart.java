package bonIDE.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class BONClass2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public BONClass2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new bonIDE.diagram.edit.policies.BONClass2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new bonIDE.diagram.edit.policies.BonideTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		BONClassFigure figure = new BONClassFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public BONClassFigure getPrimaryShape() {
		return (BONClassFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassName2EditPart) {
			((bonIDE.diagram.edit.parts.BONClassName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureBONClassNameFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureIndexRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInheritanceRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureFeatureRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassName2EditPart) {
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureIndexRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInheritanceRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureFeatureRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart) {
			return getPrimaryShape().getFigureIndexRectangleFigure();
		}
		if (editPart instanceof bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart) {
			return getPrimaryShape().getFigureInheritanceRectangleFigure();
		}
		if (editPart instanceof bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart) {
			return getPrimaryShape().getFigureFeatureRectangleFigure();
		}
		if (editPart instanceof bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart) {
			return getPrimaryShape().getFigureInvariantRectangleFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(bonIDE.diagram.part.BonideVisualIDRegistry
				.getType(bonIDE.diagram.edit.parts.BONClassName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.ClusterEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClassEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.Cluster2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClass2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.ClusterEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClassEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.Cluster2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClass2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.ClusterEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClassEditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.Cluster2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		}
		if (targetEditPart instanceof bonIDE.diagram.edit.parts.BONClass2EditPart) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001);
		types.add(bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002);
		types.add(bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.InheritanceRel_4001) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AggregationRel_4002) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_2001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_2002);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.Cluster_3001);
		}
		if (relationshipType == bonIDE.diagram.providers.BonideElementTypes.AssociationRel_4003) {
			types.add(bonIDE.diagram.providers.BonideElementTypes.BONClass_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == bonIDE.diagram.providers.BonideElementTypes.IndexClause_3003) {
				return getChildBySemanticHint(bonIDE.diagram.part.BonideVisualIDRegistry
						.getType(bonIDE.diagram.edit.parts.BONClassIndexCompartmentEditPart.VISUAL_ID));
			}
			if (type == bonIDE.diagram.providers.BonideElementTypes.InheritanceClause_3005) {
				return getChildBySemanticHint(bonIDE.diagram.part.BonideVisualIDRegistry
						.getType(bonIDE.diagram.edit.parts.BONClassInheritanceCompartmentEditPart.VISUAL_ID));
			}
			if (type == bonIDE.diagram.providers.BonideElementTypes.Feature_3006) {
				return getChildBySemanticHint(bonIDE.diagram.part.BonideVisualIDRegistry
						.getType(bonIDE.diagram.edit.parts.BONClassFeatureCompartmentEditPart.VISUAL_ID));
			}
			if (type == bonIDE.diagram.providers.BonideElementTypes.Invariant_3010) {
				return getChildBySemanticHint(bonIDE.diagram.part.BonideVisualIDRegistry
						.getType(bonIDE.diagram.edit.parts.BONClassInvariantCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class BONClassFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBONClassNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureIndexRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInheritanceRectangleFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureFeatureRectangleFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureInvariantRectangleFigure;

		/**
		 * @generated
		 */
		public BONClassFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12)
					, getMapMode().DPtoLP(12)));
			this.setLineWidth(2);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureBONClassNameFigure = new WrappingLabel();
			fFigureBONClassNameFigure.setText("<...>");

			fFigureBONClassNameFigure.setFont(FFIGUREBONCLASSNAMEFIGURE_FONT);

			this.add(fFigureBONClassNameFigure);

			fFigureIndexRectangleFigure = new RectangleFigure();
			fFigureIndexRectangleFigure.setLineWidth(1);
			fFigureIndexRectangleFigure.setForegroundColor(FFIGUREINDEXRECTANGLEFIGURE_FORE);

			this.add(fFigureIndexRectangleFigure);

			ToolbarLayout layoutFFigureIndexRectangleFigure = new ToolbarLayout();
			layoutFFigureIndexRectangleFigure.setStretchMinorAxis(true);
			layoutFFigureIndexRectangleFigure.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureIndexRectangleFigure.setSpacing(2);
			layoutFFigureIndexRectangleFigure.setVertical(true);

			fFigureIndexRectangleFigure.setLayoutManager(layoutFFigureIndexRectangleFigure);

			fFigureInheritanceRectangleFigure = new RectangleFigure();
			fFigureInheritanceRectangleFigure.setLineWidth(1);
			fFigureInheritanceRectangleFigure.setForegroundColor(FFIGUREINHERITANCERECTANGLEFIGURE_FORE);

			this.add(fFigureInheritanceRectangleFigure);

			ToolbarLayout layoutFFigureInheritanceRectangleFigure = new ToolbarLayout();
			layoutFFigureInheritanceRectangleFigure.setStretchMinorAxis(true);
			layoutFFigureInheritanceRectangleFigure.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureInheritanceRectangleFigure.setSpacing(2);
			layoutFFigureInheritanceRectangleFigure.setVertical(true);

			fFigureInheritanceRectangleFigure.setLayoutManager(layoutFFigureInheritanceRectangleFigure);

			fFigureFeatureRectangleFigure = new RectangleFigure();
			fFigureFeatureRectangleFigure.setLineWidth(1);
			fFigureFeatureRectangleFigure.setForegroundColor(FFIGUREFEATURERECTANGLEFIGURE_FORE);

			this.add(fFigureFeatureRectangleFigure);

			ToolbarLayout layoutFFigureFeatureRectangleFigure = new ToolbarLayout();
			layoutFFigureFeatureRectangleFigure.setStretchMinorAxis(true);
			layoutFFigureFeatureRectangleFigure.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureFeatureRectangleFigure.setSpacing(0);
			layoutFFigureFeatureRectangleFigure.setVertical(true);

			fFigureFeatureRectangleFigure.setLayoutManager(layoutFFigureFeatureRectangleFigure);

			fFigureInvariantRectangleFigure = new RectangleFigure();
			fFigureInvariantRectangleFigure.setFill(false);
			fFigureInvariantRectangleFigure.setLineWidth(1);

			this.add(fFigureInvariantRectangleFigure);

			ToolbarLayout layoutFFigureInvariantRectangleFigure = new ToolbarLayout();
			layoutFFigureInvariantRectangleFigure.setStretchMinorAxis(true);
			layoutFFigureInvariantRectangleFigure.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureInvariantRectangleFigure.setSpacing(0);
			layoutFFigureInvariantRectangleFigure.setVertical(true);

			fFigureInvariantRectangleFigure.setLayoutManager(layoutFFigureInvariantRectangleFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBONClassNameFigure() {
			return fFigureBONClassNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureIndexRectangleFigure() {
			return fFigureIndexRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInheritanceRectangleFigure() {
			return fFigureInheritanceRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureFeatureRectangleFigure() {
			return fFigureFeatureRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInvariantRectangleFigure() {
			return fFigureInvariantRectangleFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREBONCLASSNAMEFIGURE_FONT = new Font(Display.getCurrent(), "Lucida Sans Unicode", 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREINDEXRECTANGLEFIGURE_FORE = new Color(null, 128, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREINHERITANCERECTANGLEFIGURE_FORE = new Color(null, 0, 128, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREFEATURERECTANGLEFIGURE_FORE = new Color(null, 192, 0, 0);

}
