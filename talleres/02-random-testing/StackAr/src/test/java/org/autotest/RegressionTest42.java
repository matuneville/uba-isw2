package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2101");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr15.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        stackAr15.push((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        java.lang.String str27 = stackAr26.toString();
        boolean boolean28 = stackAr24.equals((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        boolean boolean32 = stackAr29.equals((java.lang.Object) (byte) -1);
        java.lang.String str33 = stackAr29.toString();
        boolean boolean35 = stackAr29.equals((java.lang.Object) 10L);
        java.lang.String str36 = stackAr29.toString();
        stackAr26.push((java.lang.Object) stackAr29);
        stackAr15.push((java.lang.Object) stackAr29);
        boolean boolean39 = stackAr6.equals((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        stackAr41.push((java.lang.Object) stackAr46);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) 'a');
        boolean boolean51 = stackAr50.isFull();
        boolean boolean52 = stackAr50.isEmpty();
        int int53 = stackAr50.size();
        boolean boolean54 = stackAr46.equals((java.lang.Object) int53);
        boolean boolean55 = stackAr46.isEmpty();
        boolean boolean56 = stackAr6.equals((java.lang.Object) stackAr46);
        boolean boolean57 = stackAr3.equals((java.lang.Object) boolean56);
        boolean boolean58 = stackAr3.isFull();
        boolean boolean59 = stackAr3.isFull();
        boolean boolean60 = stackAr3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2102");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean8 = stackAr1.isFull();
        java.lang.String str9 = stackAr1.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr11.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        stackAr17.push((java.lang.Object) (-1L));
        java.lang.Object obj20 = stackAr17.pop();
        stackAr11.push((java.lang.Object) stackAr17);
        boolean boolean22 = stackAr11.isEmpty();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        stackAr24.push((java.lang.Object) boolean29);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) 'a');
        boolean boolean33 = stackAr32.isFull();
        boolean boolean34 = stackAr24.equals((java.lang.Object) boolean33);
        boolean boolean35 = stackAr11.equals((java.lang.Object) boolean33);
        boolean boolean36 = stackAr11.isEmpty();
        java.lang.Class<?> wildcardClass37 = stackAr11.getClass();
        stackAr1.push((java.lang.Object) wildcardClass37);
        int int39 = stackAr1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0,1]" + "'", str9, "[0,1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2103");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        boolean boolean14 = stackAr13.isFull();
        boolean boolean16 = stackAr13.equals((java.lang.Object) (byte) -1);
        java.lang.String str17 = stackAr13.toString();
        boolean boolean19 = stackAr13.equals((java.lang.Object) 10L);
        java.lang.String str20 = stackAr13.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = stackAr22.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        stackAr22.push((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        java.lang.String str34 = stackAr33.toString();
        boolean boolean35 = stackAr31.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        boolean boolean39 = stackAr36.equals((java.lang.Object) (byte) -1);
        java.lang.String str40 = stackAr36.toString();
        boolean boolean42 = stackAr36.equals((java.lang.Object) 10L);
        java.lang.String str43 = stackAr36.toString();
        stackAr33.push((java.lang.Object) stackAr36);
        stackAr22.push((java.lang.Object) stackAr36);
        boolean boolean46 = stackAr13.equals((java.lang.Object) stackAr36);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        stackAr49.push((java.lang.Object) (-1L));
        java.lang.Object obj52 = stackAr49.pop();
        stackAr49.push((java.lang.Object) (-1));
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean56 = stackAr1.isFull();
        boolean boolean57 = stackAr1.isEmpty();
        int int58 = stackAr1.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2104");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        java.lang.Object obj4 = stackAr0.top();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr6.equals((java.lang.Object) stackAr8);
        boolean boolean11 = stackAr6.isEmpty();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.String str13 = stackAr0.toString();
        java.lang.Object obj14 = stackAr0.pop();
        int int15 = stackAr0.size();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        int int18 = stackAr17.size();
        boolean boolean19 = stackAr17.isFull();
        java.lang.String str20 = stackAr17.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean23 = stackAr22.isFull();
        int int24 = stackAr22.size();
        stackAr17.push((java.lang.Object) int24);
        boolean boolean26 = stackAr0.equals((java.lang.Object) int24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        java.lang.String str31 = stackAr30.toString();
        boolean boolean32 = stackAr28.equals((java.lang.Object) stackAr30);
        java.lang.String str33 = stackAr30.toString();
        boolean boolean34 = stackAr0.equals((java.lang.Object) stackAr30);
        boolean boolean35 = stackAr30.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0f + "'", obj4, 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0.0,[]]" + "'", str13, "[0.0,[]]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2105");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2106");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        boolean boolean14 = stackAr13.isFull();
        boolean boolean16 = stackAr13.equals((java.lang.Object) (byte) -1);
        java.lang.String str17 = stackAr13.toString();
        boolean boolean19 = stackAr13.equals((java.lang.Object) 10L);
        java.lang.String str20 = stackAr13.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = stackAr22.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        stackAr22.push((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        java.lang.String str34 = stackAr33.toString();
        boolean boolean35 = stackAr31.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        boolean boolean39 = stackAr36.equals((java.lang.Object) (byte) -1);
        java.lang.String str40 = stackAr36.toString();
        boolean boolean42 = stackAr36.equals((java.lang.Object) 10L);
        java.lang.String str43 = stackAr36.toString();
        stackAr33.push((java.lang.Object) stackAr36);
        stackAr22.push((java.lang.Object) stackAr36);
        boolean boolean46 = stackAr13.equals((java.lang.Object) stackAr36);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        boolean boolean51 = stackAr49.equals((java.lang.Object) (-1.0f));
        boolean boolean53 = stackAr49.equals((java.lang.Object) "");
        stackAr13.push((java.lang.Object) stackAr49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = stackAr49.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2107");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        boolean boolean9 = stackAr5.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        stackAr11.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackAr11.pop();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        int int19 = stackAr18.size();
        java.lang.String str20 = stackAr18.toString();
        int int21 = stackAr18.size();
        boolean boolean22 = stackAr18.isEmpty();
        boolean boolean23 = stackAr5.equals((java.lang.Object) boolean22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr25.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str34 = stackAr30.toString();
        boolean boolean36 = stackAr30.equals((java.lang.Object) 10L);
        java.lang.String str37 = stackAr30.toString();
        stackAr27.push((java.lang.Object) stackAr30);
        java.lang.String str39 = stackAr27.toString();
        boolean boolean40 = stackAr5.equals((java.lang.Object) stackAr27);
        java.lang.Object obj41 = stackAr27.pop();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        java.lang.String str44 = stackAr43.toString();
        boolean boolean45 = stackAr43.isEmpty();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        boolean boolean49 = stackAr46.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        boolean boolean52 = stackAr46.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) (-1.0f));
        boolean boolean58 = stackAr54.equals((java.lang.Object) "");
        boolean boolean59 = stackAr46.equals((java.lang.Object) "");
        boolean boolean60 = stackAr46.isFull();
        boolean boolean61 = stackAr46.isFull();
        java.lang.String str62 = stackAr46.toString();
        boolean boolean63 = stackAr46.isEmpty();
        stackAr43.push((java.lang.Object) stackAr46);
        boolean boolean65 = stackAr27.equals((java.lang.Object) stackAr43);
        java.lang.String str66 = stackAr27.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[[]]" + "'", str39, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2108");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean12 = stackAr1.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '4');
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isEmpty();
        stackAr19.push((java.lang.Object) "[[],true]");
        boolean boolean25 = stackAr14.equals((java.lang.Object) "[[],true]");
        boolean boolean26 = stackAr14.isFull();
        java.lang.Object obj27 = stackAr14.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean29 = stackAr1.isEmpty();
        java.lang.Object obj30 = stackAr1.top();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        int int33 = stackAr32.size();
        java.lang.String str34 = stackAr32.toString();
        int int35 = stackAr32.size();
        boolean boolean36 = stackAr32.isEmpty();
        java.lang.String str37 = stackAr32.toString();
        boolean boolean38 = stackAr32.isEmpty();
        int int39 = stackAr32.size();
        stackAr1.push((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2109");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        int int7 = stackAr1.size();
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        java.lang.String str12 = stackAr10.toString();
        boolean boolean13 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackAr10.getClass();
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        java.lang.Class<?> wildcardClass16 = stackAr10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2110");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        stackAr4.push((java.lang.Object) 1.0f);
        boolean boolean26 = stackAr4.isFull();
        java.lang.Object obj27 = stackAr4.top();
        java.lang.String str28 = stackAr4.toString();
        java.lang.Object obj29 = stackAr4.pop();
        java.lang.Object obj30 = stackAr4.top();
        java.lang.Class<?> wildcardClass31 = stackAr4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[null,1.0]" + "'", str28, "[null,1.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2111");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.pop();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr1.equals(obj8);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr11.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        stackAr17.push((java.lang.Object) (-1L));
        java.lang.Object obj20 = stackAr17.pop();
        stackAr11.push((java.lang.Object) stackAr17);
        boolean boolean22 = stackAr11.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) (-1.0f));
        boolean boolean36 = stackAr32.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        stackAr32.push((java.lang.Object) stackAr37);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        boolean boolean45 = stackAr41.equals((java.lang.Object) stackAr43);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        boolean boolean49 = stackAr46.equals((java.lang.Object) (byte) -1);
        java.lang.String str50 = stackAr46.toString();
        boolean boolean52 = stackAr46.equals((java.lang.Object) 10L);
        java.lang.String str53 = stackAr46.toString();
        stackAr43.push((java.lang.Object) stackAr46);
        stackAr32.push((java.lang.Object) stackAr46);
        boolean boolean56 = stackAr23.equals((java.lang.Object) stackAr46);
        boolean boolean57 = stackAr11.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) 'a');
        boolean boolean61 = stackAr59.equals((java.lang.Object) (-1.0f));
        boolean boolean63 = stackAr59.equals((java.lang.Object) "");
        stackAr23.push((java.lang.Object) stackAr59);
        int int65 = stackAr23.size();
        java.lang.Object obj66 = stackAr23.pop();
        boolean boolean67 = stackAr1.equals(obj66);
        java.lang.Class<?> wildcardClass68 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2112");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr7.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        stackAr13.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackAr13.pop();
        stackAr7.push((java.lang.Object) stackAr13);
        stackAr0.push((java.lang.Object) stackAr7);
        int int19 = stackAr7.size();
        boolean boolean20 = stackAr7.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackAr7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2113");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Object obj16 = stackAr3.top();
        java.lang.Object obj17 = null;
        stackAr3.push(obj17);
        java.lang.Object obj19 = stackAr3.top();
        java.lang.String str20 = stackAr3.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr22.isFull();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        stackAr22.push((java.lang.Object) boolean27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr30.isFull();
        boolean boolean32 = stackAr22.equals((java.lang.Object) boolean31);
        java.lang.Object obj33 = stackAr22.pop();
        boolean boolean34 = stackAr3.equals(obj33);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        boolean boolean41 = stackAr38.equals((java.lang.Object) (byte) -1);
        stackAr36.push((java.lang.Object) boolean41);
        boolean boolean43 = stackAr36.isEmpty();
        java.lang.Object obj44 = stackAr36.top();
        java.lang.Object obj45 = stackAr36.top();
        boolean boolean46 = stackAr3.equals((java.lang.Object) stackAr36);
        boolean boolean47 = stackAr36.isEmpty();
        boolean boolean48 = stackAr36.isEmpty();
        boolean boolean49 = stackAr36.isEmpty();
        int int50 = stackAr36.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[[],null]" + "'", str20, "[[],null]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2114");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2115");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (byte) 100);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr0.equals((java.lang.Object) stackAr4);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        java.lang.String str12 = stackAr11.toString();
        boolean boolean13 = stackAr9.equals((java.lang.Object) stackAr11);
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr0.equals((java.lang.Object) int14);
        java.lang.String str16 = stackAr0.toString();
        java.lang.Object obj17 = stackAr0.pop();
        boolean boolean18 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0.0]" + "'", str16, "[0.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0f + "'", obj17, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2116");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        java.lang.String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        java.lang.String str11 = stackAr7.toString();
        boolean boolean13 = stackAr7.equals((java.lang.Object) 10L);
        java.lang.String str14 = stackAr7.toString();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        stackAr16.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr25.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str34 = stackAr30.toString();
        boolean boolean36 = stackAr30.equals((java.lang.Object) 10L);
        java.lang.String str37 = stackAr30.toString();
        stackAr27.push((java.lang.Object) stackAr30);
        stackAr16.push((java.lang.Object) stackAr30);
        boolean boolean40 = stackAr7.equals((java.lang.Object) stackAr30);
        boolean boolean41 = stackAr1.equals((java.lang.Object) stackAr7);
        boolean boolean42 = stackAr7.isFull();
        java.lang.Class<?> wildcardClass43 = stackAr7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2117");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        java.lang.String str10 = stackAr7.toString();
        int int11 = stackAr7.size();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        int int14 = stackAr13.size();
        java.lang.String str15 = stackAr13.toString();
        boolean boolean16 = stackAr13.isFull();
        boolean boolean17 = stackAr13.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        int int20 = stackAr19.size();
        stackAr13.push((java.lang.Object) stackAr19);
        stackAr7.push((java.lang.Object) stackAr19);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        java.lang.String str26 = stackAr25.toString();
        java.lang.String str27 = stackAr25.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        boolean boolean34 = stackAr28.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        boolean boolean41 = stackAr28.equals((java.lang.Object) "");
        boolean boolean42 = stackAr28.isFull();
        boolean boolean43 = stackAr25.equals((java.lang.Object) stackAr28);
        java.lang.Object obj44 = null;
        stackAr28.push(obj44);
        java.lang.Object obj46 = stackAr28.top();
        boolean boolean47 = stackAr28.isEmpty();
        boolean boolean48 = stackAr28.isEmpty();
        int int49 = stackAr28.size();
        boolean boolean50 = stackAr28.isEmpty();
        boolean boolean51 = stackAr28.isEmpty();
        int int52 = stackAr28.size();
        java.lang.Object obj53 = stackAr28.top();
        stackAr7.push((java.lang.Object) stackAr28);
        java.lang.String str55 = stackAr7.toString();
        java.lang.Class<?> wildcardClass56 = stackAr7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[[],[null]]" + "'", str55, "[[],[null]]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2118");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr36.equals(obj48);
        boolean boolean50 = stackAr36.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = stackAr36.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2119");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        boolean boolean12 = stackAr6.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        stackAr6.push((java.lang.Object) stackAr14);
        boolean boolean19 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr35.toString();
        boolean boolean41 = stackAr35.equals((java.lang.Object) 10L);
        java.lang.String str42 = stackAr35.toString();
        stackAr32.push((java.lang.Object) stackAr35);
        stackAr21.push((java.lang.Object) stackAr35);
        boolean boolean45 = stackAr35.isFull();
        boolean boolean47 = stackAr35.equals((java.lang.Object) (short) 10);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean50 = stackAr49.isFull();
        java.lang.String str51 = stackAr49.toString();
        java.lang.String str52 = stackAr49.toString();
        boolean boolean53 = stackAr35.equals((java.lang.Object) stackAr49);
        stackAr6.push((java.lang.Object) stackAr35);
        boolean boolean55 = stackAr1.equals((java.lang.Object) stackAr35);
        java.lang.String str56 = stackAr1.toString();
        boolean boolean57 = stackAr1.isFull();
        int int58 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2120");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        boolean boolean30 = stackAr0.isFull();
        int int31 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2121");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        stackAr9.push((java.lang.Object) 0.0f);
        java.lang.String str12 = stackAr9.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (-1.0f));
        boolean boolean18 = stackAr14.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        stackAr14.push((java.lang.Object) stackAr19);
        boolean boolean22 = stackAr14.isFull();
        java.lang.Object obj23 = stackAr14.pop();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        java.lang.String str27 = stackAr26.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) false);
        boolean boolean32 = stackAr28.isEmpty();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr28);
        boolean boolean34 = stackAr26.isFull();
        stackAr14.push((java.lang.Object) stackAr26);
        boolean boolean36 = stackAr4.equals((java.lang.Object) stackAr26);
        boolean boolean37 = stackAr26.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0.0]" + "'", str12, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2122");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr4.equals((java.lang.Object) stackAr6);
        int int9 = stackAr4.size();
        boolean boolean10 = stackAr4.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        stackAr4.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr12);
        java.lang.String str17 = stackAr1.toString();
        java.lang.String str18 = stackAr1.toString();
        java.lang.Object obj19 = null;
        stackAr1.push(obj19);
        java.lang.Object obj21 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2123");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        java.lang.String str12 = stackAr11.toString();
        boolean boolean13 = stackAr9.equals((java.lang.Object) stackAr11);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        stackAr15.push((java.lang.Object) (-1L));
        java.lang.Object obj18 = stackAr15.pop();
        stackAr9.push((java.lang.Object) stackAr15);
        boolean boolean20 = stackAr9.isEmpty();
        boolean boolean22 = stackAr9.equals((java.lang.Object) "[[]]");
        java.lang.Object obj23 = stackAr9.pop();
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr9);
        int int25 = stackAr9.size();
        boolean boolean26 = stackAr9.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackAr9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2124");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        java.lang.String str5 = stackAr4.toString();
        java.lang.String str6 = stackAr4.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        boolean boolean13 = stackAr7.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr15.equals((java.lang.Object) "");
        boolean boolean20 = stackAr7.equals((java.lang.Object) "");
        boolean boolean21 = stackAr7.isFull();
        boolean boolean22 = stackAr4.equals((java.lang.Object) stackAr7);
        java.lang.Object obj23 = null;
        stackAr7.push(obj23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr(0);
        boolean boolean27 = stackAr7.equals((java.lang.Object) 0);
        boolean boolean28 = stackAr1.equals((java.lang.Object) 0);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) ' ');
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isFull();
        stackAr1.push((java.lang.Object) stackAr30);
        java.lang.String str34 = stackAr30.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        java.lang.String str39 = stackAr38.toString();
        boolean boolean40 = stackAr36.equals((java.lang.Object) stackAr38);
        stackAr38.push((java.lang.Object) (-1));
        boolean boolean43 = stackAr38.isFull();
        java.lang.Object obj44 = stackAr38.top();
        java.lang.String str45 = stackAr38.toString();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) 'a');
        boolean boolean49 = stackAr47.equals((java.lang.Object) (-1.0f));
        boolean boolean51 = stackAr47.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
        boolean boolean53 = stackAr52.isFull();
        stackAr47.push((java.lang.Object) stackAr52);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        java.lang.String str59 = stackAr58.toString();
        boolean boolean60 = stackAr56.equals((java.lang.Object) stackAr58);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr();
        boolean boolean62 = stackAr61.isFull();
        boolean boolean64 = stackAr61.equals((java.lang.Object) (byte) -1);
        java.lang.String str65 = stackAr61.toString();
        boolean boolean67 = stackAr61.equals((java.lang.Object) 10L);
        java.lang.String str68 = stackAr61.toString();
        stackAr58.push((java.lang.Object) stackAr61);
        stackAr47.push((java.lang.Object) stackAr61);
        boolean boolean71 = stackAr61.isFull();
        boolean boolean73 = stackAr61.equals((java.lang.Object) (short) 10);
        stackAr38.push((java.lang.Object) stackAr61);
        stackAr30.push((java.lang.Object) stackAr38);
        java.lang.Object obj76 = stackAr38.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1) + "'", obj44, (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[-1]" + "'", str45, "[-1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "[]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2125");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isEmpty();
        boolean boolean13 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        java.lang.String str18 = stackAr17.toString();
        boolean boolean19 = stackAr15.equals((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        stackAr21.push((java.lang.Object) (-1L));
        java.lang.Object obj24 = stackAr21.pop();
        stackAr15.push((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr15.isEmpty();
        boolean boolean28 = stackAr15.equals((java.lang.Object) "[[]]");
        java.lang.Object obj29 = stackAr15.pop();
        boolean boolean30 = stackAr7.equals((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        stackAr33.push((java.lang.Object) (-1L));
        int int36 = stackAr33.size();
        boolean boolean37 = stackAr33.isEmpty();
        boolean boolean38 = stackAr15.equals((java.lang.Object) stackAr33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2126");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.top();
        int int10 = stackAr1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2127");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr5.isFull();
        java.lang.Object obj14 = stackAr5.pop();
        stackAr0.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        java.lang.String str18 = stackAr17.toString();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        boolean boolean22 = stackAr19.equals((java.lang.Object) false);
        boolean boolean23 = stackAr19.isEmpty();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr19);
        boolean boolean25 = stackAr17.isFull();
        stackAr5.push((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isEmpty();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        boolean boolean32 = stackAr30.equals((java.lang.Object) (-1.0f));
        boolean boolean34 = stackAr30.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        stackAr30.push((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        java.lang.String str42 = stackAr41.toString();
        boolean boolean43 = stackAr39.equals((java.lang.Object) stackAr41);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        boolean boolean47 = stackAr44.equals((java.lang.Object) (byte) -1);
        java.lang.String str48 = stackAr44.toString();
        boolean boolean50 = stackAr44.equals((java.lang.Object) 10L);
        java.lang.String str51 = stackAr44.toString();
        stackAr41.push((java.lang.Object) stackAr44);
        stackAr30.push((java.lang.Object) stackAr44);
        java.lang.Object obj54 = stackAr30.pop();
        boolean boolean55 = stackAr27.equals((java.lang.Object) stackAr30);
        java.lang.Object obj56 = stackAr30.pop();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        java.lang.String str59 = stackAr58.toString();
        java.lang.String str60 = stackAr58.toString();
        java.lang.String str61 = stackAr58.toString();
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr63.isFull();
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr();
        boolean boolean66 = stackAr65.isFull();
        boolean boolean68 = stackAr65.equals((java.lang.Object) (byte) -1);
        stackAr63.push((java.lang.Object) boolean68);
        boolean boolean70 = stackAr63.isEmpty();
        java.lang.Object obj71 = stackAr63.top();
        stackAr58.push((java.lang.Object) stackAr63);
        java.lang.Object obj73 = stackAr63.pop();
        stackAr30.push((java.lang.Object) stackAr63);
        stackAr5.push((java.lang.Object) stackAr63);
        java.lang.Class<?> wildcardClass76 = stackAr63.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + false + "'", obj71, false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + false + "'", obj73, false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2128");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        boolean boolean25 = stackAr1.isFull();
        java.lang.String str26 = stackAr1.toString();
        java.lang.String str27 = stackAr1.toString();
        boolean boolean28 = stackAr1.isEmpty();
        boolean boolean29 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[[],[]]" + "'", str26, "[[],[]]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[[],[]]" + "'", str27, "[[],[]]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2129");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr(0);
        boolean boolean24 = stackAr4.equals((java.lang.Object) 0);
        boolean boolean25 = stackAr4.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        java.lang.String str33 = stackAr31.toString();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        boolean boolean40 = stackAr34.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        boolean boolean47 = stackAr34.equals((java.lang.Object) "");
        boolean boolean48 = stackAr34.isFull();
        boolean boolean49 = stackAr31.equals((java.lang.Object) stackAr34);
        java.lang.Object obj50 = null;
        stackAr34.push(obj50);
        java.lang.Object obj52 = stackAr34.top();
        java.lang.String str53 = stackAr34.toString();
        java.lang.Object obj54 = stackAr34.pop();
        boolean boolean55 = stackAr26.equals(obj54);
        java.lang.String str56 = stackAr26.toString();
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr();
        stackAr57.push((java.lang.Object) 0.0f);
        java.lang.String str60 = stackAr57.toString();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
        boolean boolean68 = stackAr67.isFull();
        stackAr62.push((java.lang.Object) stackAr67);
        boolean boolean70 = stackAr62.isFull();
        java.lang.Object obj71 = stackAr62.pop();
        stackAr57.push((java.lang.Object) stackAr62);
        stackAr26.push((java.lang.Object) stackAr62);
        java.lang.Object obj74 = null;
        boolean boolean75 = stackAr62.equals(obj74);
        stackAr4.push((java.lang.Object) boolean75);
        java.lang.Object obj77 = stackAr4.top();
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) 'a');
        boolean boolean81 = stackAr79.equals((java.lang.Object) (-1.0f));
        boolean boolean83 = stackAr79.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr84 = new org.autotest.StackAr();
        boolean boolean85 = stackAr84.isFull();
        stackAr79.push((java.lang.Object) stackAr84);
        java.lang.String str87 = stackAr79.toString();
        boolean boolean88 = stackAr4.equals((java.lang.Object) stackAr79);
        org.autotest.StackAr stackAr90 = new org.autotest.StackAr((int) 'a');
        boolean boolean92 = stackAr90.equals((java.lang.Object) (-1.0f));
        int int93 = stackAr90.size();
        boolean boolean95 = stackAr90.equals((java.lang.Object) (byte) 100);
        boolean boolean96 = stackAr90.isFull();
        stackAr79.push((java.lang.Object) stackAr90);
        int int98 = stackAr79.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[null]" + "'", str53, "[null]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[0.0]" + "'", str60, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + false + "'", obj77, false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[[]]" + "'", str87, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2130");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        stackAr1.push((java.lang.Object) boolean12);
        java.lang.String str14 = stackAr1.toString();
        boolean boolean15 = stackAr1.isFull();
        boolean boolean16 = stackAr1.isFull();
        boolean boolean17 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        int int22 = stackAr19.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        java.lang.String str25 = stackAr24.toString();
        java.lang.String str26 = stackAr24.toString();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        boolean boolean30 = stackAr27.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        boolean boolean33 = stackAr27.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        boolean boolean40 = stackAr27.equals((java.lang.Object) "");
        boolean boolean41 = stackAr27.isFull();
        boolean boolean42 = stackAr24.equals((java.lang.Object) stackAr27);
        int int43 = stackAr27.size();
        stackAr19.push((java.lang.Object) int43);
        java.lang.Object obj45 = stackAr19.top();
        boolean boolean46 = stackAr19.isFull();
        java.lang.Object obj47 = null;
        boolean boolean48 = stackAr19.equals(obj47);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        java.lang.String str51 = stackAr50.toString();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
        boolean boolean53 = stackAr52.isFull();
        boolean boolean55 = stackAr52.equals((java.lang.Object) false);
        boolean boolean56 = stackAr52.isEmpty();
        boolean boolean57 = stackAr50.equals((java.lang.Object) stackAr52);
        boolean boolean58 = stackAr52.isFull();
        stackAr19.push((java.lang.Object) boolean58);
        stackAr1.push((java.lang.Object) boolean58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[false]" + "'", str14, "[false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2131");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr0.equals((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr7.isFull();
        boolean boolean13 = stackAr7.isFull();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr15.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        java.lang.String str19 = stackAr18.toString();
        java.lang.String str20 = stackAr18.toString();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        boolean boolean27 = stackAr21.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) (-1.0f));
        boolean boolean33 = stackAr29.equals((java.lang.Object) "");
        boolean boolean34 = stackAr21.equals((java.lang.Object) "");
        boolean boolean35 = stackAr21.isFull();
        boolean boolean36 = stackAr18.equals((java.lang.Object) stackAr21);
        int int37 = stackAr21.size();
        stackAr15.push((java.lang.Object) int37);
        int int39 = stackAr15.size();
        java.lang.Object obj40 = stackAr15.top();
        boolean boolean41 = stackAr7.equals(obj40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        java.lang.String str45 = stackAr43.toString();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        boolean boolean49 = stackAr46.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        boolean boolean52 = stackAr46.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) (-1.0f));
        boolean boolean58 = stackAr54.equals((java.lang.Object) "");
        boolean boolean59 = stackAr46.equals((java.lang.Object) "");
        boolean boolean60 = stackAr46.isFull();
        boolean boolean61 = stackAr43.equals((java.lang.Object) stackAr46);
        java.lang.Object obj62 = null;
        stackAr46.push(obj62);
        java.lang.Object obj64 = stackAr46.top();
        java.lang.String str65 = stackAr46.toString();
        int int66 = stackAr46.size();
        boolean boolean67 = stackAr7.equals((java.lang.Object) stackAr46);
        java.lang.Class<?> wildcardClass68 = stackAr46.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[null]" + "'", str65, "[null]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2132");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        boolean boolean9 = stackAr5.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        stackAr11.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackAr11.pop();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr5);
        java.lang.Object obj17 = stackAr5.pop();
        boolean boolean18 = stackAr5.isEmpty();
        int int19 = stackAr5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2133");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr14.isEmpty();
        boolean boolean16 = stackAr0.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (-1.0f));
        boolean boolean22 = stackAr18.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        stackAr18.push((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        java.lang.String str30 = stackAr29.toString();
        boolean boolean31 = stackAr27.equals((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        boolean boolean35 = stackAr32.equals((java.lang.Object) (byte) -1);
        java.lang.String str36 = stackAr32.toString();
        boolean boolean38 = stackAr32.equals((java.lang.Object) 10L);
        java.lang.String str39 = stackAr32.toString();
        stackAr29.push((java.lang.Object) stackAr32);
        stackAr18.push((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isEmpty();
        boolean boolean45 = stackAr43.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        java.lang.String str50 = stackAr49.toString();
        boolean boolean51 = stackAr47.equals((java.lang.Object) stackAr49);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        stackAr53.push((java.lang.Object) (-1L));
        java.lang.Object obj56 = stackAr53.pop();
        stackAr47.push((java.lang.Object) stackAr53);
        boolean boolean58 = stackAr43.equals((java.lang.Object) stackAr47);
        stackAr32.push((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean62 = stackAr61.isFull();
        int int63 = stackAr61.size();
        int int64 = stackAr61.size();
        stackAr47.push((java.lang.Object) stackAr61);
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) '4');
        java.lang.String str68 = stackAr67.toString();
        stackAr67.push((java.lang.Object) 0);
        stackAr47.push((java.lang.Object) 0);
        stackAr14.push((java.lang.Object) stackAr47);
        java.lang.Class<?> wildcardClass73 = stackAr47.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2134");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.String str8 = stackAr6.toString();
        int int9 = stackAr6.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) int9);
        boolean boolean11 = stackAr1.isFull();
        int int12 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2135");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        int int8 = stackAr1.size();
        java.lang.Object obj9 = null;
        stackAr1.push(obj9);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        java.lang.String str15 = stackAr11.toString();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        stackAr24.push((java.lang.Object) (-1L));
        java.lang.Object obj27 = stackAr24.pop();
        stackAr18.push((java.lang.Object) stackAr24);
        stackAr11.push((java.lang.Object) stackAr18);
        int int30 = stackAr11.size();
        boolean boolean31 = stackAr11.isFull();
        java.lang.String str32 = stackAr11.toString();
        int int33 = stackAr11.size();
        boolean boolean34 = stackAr1.equals((java.lang.Object) int33);
        java.lang.Object obj35 = stackAr1.pop();
        java.lang.Object obj36 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1L) + "'", obj27, (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[[[]]]" + "'", str32, "[[[]]]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2136");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        stackAr3.push((java.lang.Object) stackAr17);
        boolean boolean21 = stackAr3.isFull();
        java.lang.String str22 = stackAr3.toString();
        int int23 = stackAr3.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = stackAr24.toString();
        boolean boolean30 = stackAr24.equals((java.lang.Object) 10L);
        java.lang.String str31 = stackAr24.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        stackAr33.push((java.lang.Object) stackAr38);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        java.lang.String str45 = stackAr44.toString();
        boolean boolean46 = stackAr42.equals((java.lang.Object) stackAr44);
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        java.lang.String str51 = stackAr47.toString();
        boolean boolean53 = stackAr47.equals((java.lang.Object) 10L);
        java.lang.String str54 = stackAr47.toString();
        stackAr44.push((java.lang.Object) stackAr47);
        stackAr33.push((java.lang.Object) stackAr47);
        boolean boolean57 = stackAr24.equals((java.lang.Object) stackAr47);
        boolean boolean58 = stackAr47.isEmpty();
        java.lang.String str59 = stackAr47.toString();
        boolean boolean60 = stackAr47.isEmpty();
        stackAr3.push((java.lang.Object) stackAr47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[],[]]" + "'", str22, "[[],[]]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2137");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr6.equals((java.lang.Object) int13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        stackAr16.push((java.lang.Object) stackAr21);
        java.lang.Class<?> wildcardClass24 = stackAr16.getClass();
        boolean boolean25 = stackAr6.equals((java.lang.Object) stackAr16);
        java.lang.String str26 = stackAr6.toString();
        java.lang.String str27 = stackAr6.toString();
        java.lang.String str28 = stackAr6.toString();
        boolean boolean29 = stackAr6.isFull();
        boolean boolean30 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2138");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr8.equals((java.lang.Object) stackAr10);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        stackAr14.push((java.lang.Object) (-1L));
        java.lang.Object obj17 = stackAr14.pop();
        stackAr8.push((java.lang.Object) stackAr14);
        boolean boolean19 = stackAr4.equals((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        int int22 = stackAr21.size();
        java.lang.String str23 = stackAr21.toString();
        int int24 = stackAr21.size();
        boolean boolean25 = stackAr21.isEmpty();
        boolean boolean26 = stackAr8.equals((java.lang.Object) boolean25);
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean28 = stackAr1.isFull();
        int int29 = stackAr1.size();
        java.lang.String str30 = stackAr1.toString();
        java.lang.Class<?> wildcardClass31 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[[[]]]" + "'", str30, "[[[]]]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2139");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        java.lang.String str18 = stackAr16.toString();
        int int19 = stackAr16.size();
        boolean boolean20 = stackAr16.isEmpty();
        java.lang.String str21 = stackAr16.toString();
        boolean boolean22 = stackAr16.isEmpty();
        stackAr3.push((java.lang.Object) boolean22);
        java.lang.Object obj24 = stackAr3.pop();
        java.lang.Object obj25 = stackAr3.pop();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2140");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.String str12 = stackAr7.toString();
        boolean boolean13 = stackAr7.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2141");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        stackAr3.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = stackAr17.toString();
        boolean boolean23 = stackAr17.equals((java.lang.Object) 10L);
        java.lang.String str24 = stackAr17.toString();
        stackAr14.push((java.lang.Object) stackAr17);
        stackAr3.push((java.lang.Object) stackAr17);
        java.lang.Object obj27 = stackAr3.pop();
        boolean boolean28 = stackAr0.equals((java.lang.Object) stackAr3);
        java.lang.Object obj29 = stackAr3.pop();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        java.lang.String str33 = stackAr31.toString();
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        boolean boolean41 = stackAr38.equals((java.lang.Object) (byte) -1);
        stackAr36.push((java.lang.Object) boolean41);
        boolean boolean43 = stackAr36.isEmpty();
        java.lang.Object obj44 = stackAr36.top();
        stackAr31.push((java.lang.Object) stackAr36);
        java.lang.Object obj46 = stackAr36.pop();
        stackAr3.push((java.lang.Object) stackAr36);
        java.lang.String str48 = stackAr3.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[[]]" + "'", str48, "[[]]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2142");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) false);
        boolean boolean7 = stackAr3.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        java.lang.String str13 = stackAr9.toString();
        boolean boolean14 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr16.isEmpty();
        boolean boolean20 = stackAr9.equals((java.lang.Object) stackAr16);
        boolean boolean21 = stackAr16.isFull();
        java.lang.String str22 = stackAr16.toString();
        boolean boolean23 = stackAr3.equals((java.lang.Object) str22);
        boolean boolean24 = stackAr3.isFull();
        boolean boolean25 = stackAr3.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2143");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        java.lang.String str5 = stackAr4.toString();
        java.lang.String str6 = stackAr4.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        boolean boolean13 = stackAr7.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr15.equals((java.lang.Object) "");
        boolean boolean20 = stackAr7.equals((java.lang.Object) "");
        boolean boolean21 = stackAr7.isFull();
        boolean boolean22 = stackAr4.equals((java.lang.Object) stackAr7);
        int int23 = stackAr7.size();
        stackAr1.push((java.lang.Object) int23);
        int int25 = stackAr1.size();
        boolean boolean26 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        stackAr28.push((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        java.lang.String str40 = stackAr39.toString();
        boolean boolean41 = stackAr37.equals((java.lang.Object) stackAr39);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        boolean boolean45 = stackAr42.equals((java.lang.Object) (byte) -1);
        java.lang.String str46 = stackAr42.toString();
        boolean boolean48 = stackAr42.equals((java.lang.Object) 10L);
        java.lang.String str49 = stackAr42.toString();
        stackAr39.push((java.lang.Object) stackAr42);
        stackAr28.push((java.lang.Object) stackAr42);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean54 = stackAr53.isEmpty();
        boolean boolean55 = stackAr53.isFull();
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) '4');
        java.lang.String str60 = stackAr59.toString();
        boolean boolean61 = stackAr57.equals((java.lang.Object) stackAr59);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        stackAr63.push((java.lang.Object) (-1L));
        java.lang.Object obj66 = stackAr63.pop();
        stackAr57.push((java.lang.Object) stackAr63);
        boolean boolean68 = stackAr53.equals((java.lang.Object) stackAr57);
        stackAr42.push((java.lang.Object) stackAr57);
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean72 = stackAr71.isFull();
        int int73 = stackAr71.size();
        int int74 = stackAr71.size();
        stackAr57.push((java.lang.Object) stackAr71);
        boolean boolean76 = stackAr1.equals((java.lang.Object) stackAr71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = stackAr71.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1L) + "'", obj66, (-1L));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2144");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr0.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        stackAr35.push((java.lang.Object) stackAr40);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr44.isFull();
        boolean boolean46 = stackAr44.isEmpty();
        int int47 = stackAr44.size();
        boolean boolean48 = stackAr40.equals((java.lang.Object) int47);
        boolean boolean49 = stackAr40.isEmpty();
        boolean boolean50 = stackAr0.equals((java.lang.Object) stackAr40);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '4');
        int int53 = stackAr52.size();
        stackAr52.push((java.lang.Object) 0);
        java.lang.String str56 = stackAr52.toString();
        java.lang.Object obj57 = stackAr52.pop();
        stackAr0.push(obj57);
        boolean boolean59 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass60 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[0]" + "'", str56, "[0]");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2145");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        stackAr3.push((java.lang.Object) (-1));
        boolean boolean8 = stackAr3.isFull();
        java.lang.Object obj9 = stackAr3.top();
        java.lang.String str10 = stackAr3.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        stackAr11.push((java.lang.Object) 0.0f);
        int int14 = stackAr11.size();
        stackAr3.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr3.isFull();
        boolean boolean17 = stackAr3.isFull();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1) + "'", obj9, (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1]" + "'", str10, "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2146");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2147");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isEmpty();
        boolean boolean8 = stackAr0.isFull();
        int int9 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2148");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        java.lang.String str15 = stackAr6.toString();
        boolean boolean16 = stackAr6.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr(10);
        stackAr6.push((java.lang.Object) stackAr18);
        java.lang.String str20 = stackAr18.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackAr18.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2149");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        int int15 = stackAr3.size();
        java.lang.String str16 = stackAr3.toString();
        java.lang.Object obj17 = null;
        boolean boolean18 = stackAr3.equals(obj17);
        int int19 = stackAr3.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test2150");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (byte) 100);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr0.equals((java.lang.Object) stackAr4);
        java.lang.String str8 = stackAr0.toString();
        java.lang.Object obj9 = stackAr0.top();
        boolean boolean10 = stackAr0.isEmpty();
        java.lang.String str11 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0.0]" + "'", str8, "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0.0]" + "'", str11, "[0.0]");
    }
}

