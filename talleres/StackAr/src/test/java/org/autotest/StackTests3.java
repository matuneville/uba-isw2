package org.autotest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    // Tests de StackTests2.java
    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    public void testAreTwoEmptyStacksEqual() throws Exception {
        // esperamos que al cambiar != por == en la linea 76, este test no lo pase y mate al mutante,
        // ya que tenemos dos stacks iguales y debería dar true, pero por el if(...) de la 76 no lo va a pasar
        Stack stackA = createStack(2);
        Stack stackB = createStack(2);
        assertEquals(stackA, stackB);
    }

    public void testCompareTwoNotEqualStacksHashCode() throws Exception{
        // esperamos que en el mutante, dos stacks que no son equivalentes
        // compartan hashcode, lo cual está mal
        Stack stackA = createStack(1);
        Stack stackB = createStack(1);
        stackA.push(42);
        stackB.push(60);
        assertNotEquals(stackA.hashCode(), stackB.hashCode());
    }
}
