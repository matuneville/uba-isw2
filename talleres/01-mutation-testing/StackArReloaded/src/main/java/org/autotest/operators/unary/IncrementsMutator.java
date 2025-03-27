package org.autotest.operators.unary;

import org.autotest.helpers.UnaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#INCREMENTS
 *
 * Este operador de mutación reemplaza los operadores de incremento y decremento de variables locales (variables de pila).
 */
public class IncrementsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtUnaryOperator)) {
            return false;
        }

        CtUnaryOperator op = (CtUnaryOperator)candidate;
        List<UnaryOperatorKind> targetOperations = Arrays.asList(
                UnaryOperatorKind.POSTDEC, // i--
                UnaryOperatorKind.POSTINC,  // i++
                UnaryOperatorKind.PREDEC, // --i
                UnaryOperatorKind.PREINC // ++i
        );
        return targetOperations.contains(op.getKind());

    }

    @Override
    public void process(CtElement candidate) {
        if (candidate instanceof CtUnaryOperator) {
            CtUnaryOperator op = (CtUnaryOperator) candidate;
            op.setKind(getReplacement(op.getKind()));
        }
    }

    public UnaryOperatorKind getReplacement(UnaryOperatorKind kind) {
        switch (kind) {
            case POSTDEC:
                return UnaryOperatorKind.POSTINC;
            case POSTINC:
                return UnaryOperatorKind.POSTDEC;
            case PREDEC:
                return UnaryOperatorKind.PREINC;
            case PREINC:
                return UnaryOperatorKind.PREDEC;
        }
        return kind;
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtUnaryOperator op = (CtUnaryOperator) candidate;
        UnaryOperatorKind originalKind = op.getKind();
        UnaryOperatorKind mutatedKind = getReplacement(originalKind);

        return this.getClass().getSimpleName() + ": Se reemplazó " +
                originalKind + " por " + mutatedKind +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
