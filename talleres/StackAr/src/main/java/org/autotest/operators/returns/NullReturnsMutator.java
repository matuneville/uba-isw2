package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#NULL_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven una variable de tipo no-primitivo por null.
 */
public class NullReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn) candidate;
        CtExpression returnedExpression = op.getReturnedExpression();

        if (returnedExpression == null) {
            return false; // TODO es necesario?
        }

        CtTypeReference typeRef = returnedExpression.getType();

        return typeRef != null && !typeRef.isPrimitive();
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral<?> nullLiteral = candidate.getFactory().createLiteral(null);

        CtReturn op = (CtReturn)candidate;
        op.setReturnedExpression(nullLiteral);
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn)candidate;
        CtLiteral<?> nullLiteral = candidate.getFactory().createLiteral(null);
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por " + nullLiteral +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
