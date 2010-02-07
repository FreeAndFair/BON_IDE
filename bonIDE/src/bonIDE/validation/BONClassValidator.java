/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bonIDE.validation;

import bonIDE.BONClass;
import bonIDE.Feature;

import bonIDE.ImplementationStatus;
import bonIDE.IndexClause;
import bonIDE.InheritanceClause;
import bonIDE.Parent;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bonIDE.BONClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BONClassValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateFeatures(EList<Feature> value);
	boolean validateIsDeferred(boolean value);
	boolean validateParents(EList<String> value);

	boolean validateIndexes(EList<IndexClause> value);

	boolean validateParents(InheritanceClause value);

	boolean validateParents(Parent value);

	boolean validateIndexes(IndexClause value);

	boolean validateImplementationStatus(ImplementationStatus value);
}
