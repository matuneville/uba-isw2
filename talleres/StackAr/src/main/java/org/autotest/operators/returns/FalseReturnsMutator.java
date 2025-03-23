package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#FALSE_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por false.
 */
public class FalseReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn)candidate;
        String type = getReturnedExpressionType(op);
        List<String> targetTypes = Arrays.asList(
                "boolean"
        );

        if (!targetTypes.contains(type))
            return false;

        return !returnedExpressionIsFalse((CtReturn) candidate);
    }

    private static boolean returnedExpressionIsFalse(CtReturn candidate) {
        CtExpression<Boolean> returned_value = candidate.getReturnedExpression();
        String returned_value_string = returned_value.toString();

        return returned_value_string.equals("false");
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(false);

        CtReturn op = (CtReturn)candidate;
        op.setReturnedExpression(falseLiteral);
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn)candidate;
        CtReturn<Boolean> falseReturn = candidate.getFactory().createReturn();
        CtLiteral<Boolean> falseLiteral = candidate.getFactory().createLiteral(false);
        falseReturn.setReturnedExpression(falseLiteral);
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por " + falseReturn +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
