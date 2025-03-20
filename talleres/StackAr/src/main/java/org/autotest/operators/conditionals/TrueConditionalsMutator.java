package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtIf)) {
            return false;
        }
        return true;
    }

    @Override
    public void process(CtElement candidate) {
        CtIf conditional = (CtIf)candidate;
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(true);
        conditional.setCondition(falseLiteral);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf op = (CtIf) candidate;

        // esto es asi? funciona
        CtExpression<Boolean> condition = op.getCondition();

        String originalCondition = condition.toString();
        // si. ahi va.
        CtLiteral<Boolean> trueLiteral = candidate.getFactory().createLiteral(true);

        return this.getClass().getSimpleName() + ": Se reemplazó la condición '" +
                originalCondition + "' por " + trueLiteral + " en la línea " +
                op.getPosition().getLine() + ".";
    }
}
