package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 * <p>
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtIf))
            return false;

        if (conditionIsTrue((CtIf) candidate))
            return false;

        return true;
    }

    private static boolean conditionIsTrue(CtIf candidate) {
        CtIf conditional = candidate;
        CtExpression<Boolean> condition = conditional.getCondition();
        String condition_string = condition.toString();

        if (condition_string.equals("true")) {
            return true;
        }
        return false;
    }

    @Override
    public void process(CtElement candidate) {
        CtIf conditional = (CtIf) candidate;
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(true);
        conditional.setCondition(falseLiteral);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf op = (CtIf) candidate;

        CtExpression<Boolean> condition = op.getCondition();
        String originalCondition = condition.toString();

        return this.getClass().getSimpleName() + ": Se reemplazó la condición '" +
                originalCondition + "' por true en la línea " +
                op.getPosition().getLine() + ".";
    }
}
