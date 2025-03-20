package org.autotest.operators.conditionals;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
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
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(false);
        conditional.setCondition(falseLiteral);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf op = (CtIf) candidate;

        // esto es asi? funciona
        CtExpression<Boolean> condition = op.getCondition();

        String originalCondition = condition.toString();
        // si. ahi va.
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(false);

        return this.getClass().getSimpleName() + ": Se reemplazó la condición '" +
                originalCondition + "' por " + falseLiteral + " en la línea " +
                op.getPosition().getLine() + ".";
    }

}
