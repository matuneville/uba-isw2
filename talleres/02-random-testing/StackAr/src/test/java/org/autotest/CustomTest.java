package org.autotest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@RunWith(JUnit4.class)

public class CustomTest {
    @Test
    public void testPopReturnsCorrectValue() throws Throwable{
        System.out.println("custom Test corriendo:\n");
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
}
