package org.autotest.operators.constants;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

public class OneConstantMutator extends MutationOperator {
    /**
     * Operador de mutación basado en https://pitest.org/quickstart/mutators/#EXPERIMENTAL_CRCR
     *
     * Este operador reemplaza los valores de las constantes por uno.
     */
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        List<String> targetTypes = List.of(
                "int"
        );
        boolean isLiteral = candidate instanceof CtLiteral;
        boolean isUnaryOperator = candidate instanceof CtUnaryOperator;
        if (isLiteral) {
            CtLiteral<?> candidate_lit = (CtLiteral<?>)candidate;
            String type = getLiteralType(candidate_lit);


            boolean isNumber = targetTypes.contains(type);
            boolean isOne = candidate_lit.toString().equals("1");

            CtElement parent = candidate.getParent();
            boolean parentIsUnary = parent instanceof CtUnaryOperator;
            boolean parentIsNEG = parentIsUnary && (((CtUnaryOperator<?>)parent).getKind() == UnaryOperatorKind.NEG);

            return !parentIsNEG && isNumber && !isOne;
        }
        else if (isUnaryOperator) {
            CtUnaryOperator<?> candidate_unary = (CtUnaryOperator<?>)candidate;
            boolean isNEG = candidate_unary.getKind() == UnaryOperatorKind.NEG;
            CtElement operand = candidate_unary.getOperand();

            boolean operandIsInt = false;
            if (operand instanceof CtLiteral)
                operandIsInt = targetTypes.contains(getLiteralType((CtLiteral<?>) operand));

            return isNEG && operandIsInt;
        }
        return false;
    }

    @Override
    public void process(CtElement candidate) {
        boolean isLiteral = candidate instanceof CtLiteral;
        if (isLiteral) {
            CtLiteral candidate_lit = (CtLiteral) candidate;
            candidate_lit.setValue(candidate_lit.getFactory().Code().createLiteral(1));
        }
        else { // Es un CtUnaryOperator de tipo NEG, ya filtrado en isToBe
            CtUnaryOperator unaryOp = (CtUnaryOperator<?>) candidate;
            unaryOp.setOperand(unaryOp.getFactory().Code().createLiteral(1));
            unaryOp.setKind(UnaryOperatorKind.POS); // Cambia NEG (-) por POS (+)
            //System.out.print(unaryOp.toString() + '\n');
        }
    }

    private static String getLiteralType(CtLiteral op) {
        return op.getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                candidate.toString() + " por 1" +
                " en la línea " + candidate.getPosition().getLine() + ".";
    }
}