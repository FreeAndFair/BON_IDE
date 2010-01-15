/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bonIDE.validation;

import bonIDE.Abstraction;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bonIDE.Model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelValidator {
	boolean validate();

	boolean validateAbstractions(EList<Abstraction> value);
}