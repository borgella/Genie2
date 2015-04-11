/**
 *
 * $Id$
 */
package inf5153emf.validation;

import inf5153emf.Circuit;
import inf5153emf.TableVCircuit;
import inf5153emf.TableVerite;

/**
 * A sample validator interface for {@link inf5153emf.CircuitLogic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CircuitLogicValidator {
	boolean validate();

	boolean validateCircuit(Circuit value);
	boolean validateTablevcircuit(TableVCircuit value);

	boolean validateTableverite(TableVerite value);
}
