package org.autotest.operators.conditionals;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 * <p>
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtIf))
            return false;

        if (conditionIsFalse((CtIf) candidate))
            return false;

        return true;
    }

    private static boolean conditionIsFalse(CtIf candidate) {
        CtIf conditional = candidate;
        CtExpression<Boolean> condition = conditional.getCondition();
        String condition_string = condition.toString();

        if (condition_string.equals("false")) {
            return true;
        }
        return false;
    }

    @Override
    public void process(CtElement candidate) {
        // candidate es de la forma: "if(condition){...}else{...}"
        CtIf conditional = (CtIf) candidate;

        // con la factory y el candidato "if...", lo mofidicamos para que sea "if(FALSE){...}else{...}"
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(false);

        conditional.setCondition(falseLiteral);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        // candidate es de la forma: "if(condition){...}else{...}"
        CtIf op = (CtIf) candidate;

        // al hacer op.getCondition(), nos quedamos con el "condition" del if(...)
        CtExpression<Boolean> condition = op.getCondition();
        String originalCondition = condition.toString();

        return this.getClass().getSimpleName() + ": Se reemplazó la condición '" +
                originalCondition + "' por false en la línea " +
                op.getPosition().getLine() + ".";
    }

}
