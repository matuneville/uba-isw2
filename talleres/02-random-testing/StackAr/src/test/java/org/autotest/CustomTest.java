package org.autotest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@RunWith(JUnit4.class)

public class CustomTest {
    @Test
    public void testPopReturnsCorrectValue() throws Throwable{
        StackAr stack = new StackAr();
        stack.push(1);
        int rv = (int)stack.pop();
        assertEquals(1,rv);
    }

    @Test
    public void testCompareTwoEqualStacks() throws Throwable{
        StackAr stack1 = new StackAr();
        assertTrue(stack1.equals(stack1));
    }

    @Test
    public void testCompareDifferentStackHashCodes() throws Throwable{
        // mata al mutante que retorna 0 en hashCode
        StackAr stack1 = new StackAr(1);
        StackAr stack2 = new StackAr(1);
        stack1.push(2);
        stack2.push(13);
        System.out.print("DEBUG" + stack2.hashCode());
        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    @Test
    public void testCompareExpectedHashCode() throws Throwable{

        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) (byte) 100);

        int expectedHash = 822574212; // corro

        assertEquals(expectedHash, stackAr0.hashCode());
    }

    @Test
    public void testCompareAnotherExpectedHashCode() throws Throwable{

        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);

        int expectedHash = -1648907103; // corro

        assertEquals(expectedHash, stackAr0.hashCode());
    }

    /*
    * 113
1. Replaced integer multiplication with division → SURVIVED

2. Replaced integer addition with subtraction → SURVIVED

114
1. Replaced integer multiplication with division → KILLED

2. Replaced integer addition with subtraction → SURVIVED
    * */
}
