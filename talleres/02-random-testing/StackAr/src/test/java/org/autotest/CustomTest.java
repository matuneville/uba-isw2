package org.autotest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;


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
        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }
}
