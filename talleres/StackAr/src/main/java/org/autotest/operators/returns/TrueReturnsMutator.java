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
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#TRUE_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por true.
 */
public class TrueReturnsMutator extends MutationOperator {
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
        // chequear que no sea false (para no reemplazar false por false)
        // CtExpression<Boolean> falseRet = ((CtReturn)candidate).getReturnedExpression();

        return targetTypes.contains(type); //&& op != falseRet;
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral<Boolean> trueLiteral = candidate.getFactory().createLiteral(true);

        CtReturn op = (CtReturn)candidate;
        op.setReturnedExpression(trueLiteral);
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn)candidate;
        CtReturn<Boolean> trueReturn = candidate.getFactory().createReturn();
        CtLiteral<Boolean> trueLiteral = candidate.getFactory().createLiteral(true);
        trueReturn.setReturnedExpression(trueLiteral);
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por " + trueReturn +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}

