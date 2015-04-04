/**
 *
 * $Id$
 */
package inf5153emf.validation;

import inf5153emf.Circuit;
import inf5153emf.Memento;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link inf5153emf.CommandeConcrete}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CommandeConcreteValidator {
	boolean validate();

	boolean validateExecutes(EList<Circuit> value);
	boolean validateExecute(EList<Memento> value);
}