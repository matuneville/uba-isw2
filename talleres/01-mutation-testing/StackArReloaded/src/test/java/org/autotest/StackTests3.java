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

    public void testCompareDifferentArraysWithPop() throws Exception {
        // buscamos que al reemplazar true por false en la linea 82, se mate al mutante,
        // esto lo hacemos al aprovecharnos de que readIndex se resta pero el elemento
        // sigue estando en el array al popear, haciendo que los arrays sean iguales,
        // lo cual nos permite pasar el if anterior, y romperlo en el if de la linea 82
        Stack stackA = createStack(2);
        Stack stackB = createStack(2);

        // readIndex = 0
        stackA.push(42);
        stackB.push(42);

        // readIndex = 1
        stackA.push(60);
        stackB.push(60);

        // B.readIndex = 0
        // A.readIndex = 1
        stackB.pop();

        assertNotEquals(stackA, stackB);
    }

    public void testCompareDifferentArrays() throws Exception {
        // matamos los mutantes que vivian al cambiar el condicional de la 79 por false
        // simplemente hay que comparar stacks distintos
        Stack stackA = createStack(2);
        Stack stackB = createStack(2);

        stackA.push(420);
        stackB.push(69);

        assertNotEquals(stackA, stackB);
    }

    public void testCompareStackWithDifferentClass() throws Exception {
        // buscamos matar al mutante que cambia la comparación de que sean del mismo tipo (StackAr)
        // por un False, entonces se salta eso y se rompe el mutante al realizar metodos
        // como .elems a una clase que (asumimos) no los tiene, como por ejemplo String
        Stack stack = createStack(2);
        String palabra = ";)";

        assertNotEquals(stack, palabra);
    }

    public void testCheckTopNumberWithNumber() throws Exception{
        // mata al mutante que retorna Null como top
        int numero = 13;
        Stack stackA = createStack(1);
        stackA.push(numero);

        assertEquals(numero, stackA.top());
    }

    public void testAskTopWithEmptyStack() throws Exception {
        Stack stack = createStack(1);
        assertThrows(IllegalStateException.class, stack::top);
    }

    public void testInstantiateStackWithCapacityOfZero() throws Exception{
        assertDoesNotThrow(() -> createStack(0));
    }

    public void testCompareStackWithNull() throws Exception{
        Stack stack = createStack(1);
        assertNotEquals(stack, null);
    }

    public void testCompareStackWithHimself() throws Exception{
        Stack stack = createStack(1);
        assertEquals(stack, stack);
    }

    public void testCheckDefaultCapacity() throws Exception {
        Stack stack = createStack();
        stack.push(69);
        assertFalse(stack.isFull());
    }

    public void testCheckStackPop() throws Exception {
        Stack stack = createStack(1);
        int numero = 12;
        stack.push(numero);
        assertEquals(stack.pop(), numero);
    }

    public void testAskPushWithFullStack() throws Exception {
        Stack stack = createStack(0);
        assertThrows(IllegalStateException.class, () -> stack.push(42));
    }

    public void testStackHasCorrectHashCode() throws Exception {
        Stack stack = createStack(5);
        stack.push(42);
        stack.push(60);
        stack.push(60);
        stack.push(67876);
        assertEquals(stack.hashCode(), -2082610753);

    }
}
