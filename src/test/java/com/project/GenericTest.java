package com.project;

import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;

public class GenericTest {

    private Integer x;
    private Float y;
    private String z;

    @Test
    public void givenThreeIntegers_whenFindMax1_returnTrue() {
        // GenericMainClass genericsMainClass = new GenericMainClass();
        int a = 30;
        int b = 20;
        int c = 10;
        //findMaxValue(x,y,z);
        //findMaxValue(y);
        //findMaxValue(z);

        new GenericMainClass<Serializable, Float, Comparable>(x, y, z).findMaxValue();
    }
//        Integer result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(a, result.intValue());
    }
//    @Test
//    public void givenThreeIntegers_whenFindMax2_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        int a = 10;
//        int b = 30;
//        int c = 20;
//        Integer result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(b, result.intValue());
//    }
//    @Test
//    public void givenThreeIntegers_whenFindMax3_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        int a = 20;
//        int b = 10;
//        int c = 30;
//        Integer result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(c, result.intValue());
//    }
//
//    @Test
//    public void givenThreeFloat_whenFindMax1_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        float a = 30.8f;
//        float b = 20.0f;
//        float c = 10.0f;
//        Float result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(a, result.floatValue());
//    }
//    @Test
//    public void givenThreeFloat_whenFindMax2_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        float a = 10.0f;
//        float b = 30.0f;
//        float c = 20.0f;
//        Float result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(b, result.floatValue());
//    }
//    @Test
//    public void givenThreeFloat_whenFindMax3_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        float a = 20.0f;
//        float b = 10.0f;
//        float c = 30.0f;
//        Float result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(c, result.floatValue());
//    }
//
//    @Test
//    public void givenThreeString_whenFindMax1_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        String a = "Peach";
//        String b = "Apple";
//        String c = "Banana";
//        String result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(a, result);
//    }
//    @Test
//    public void givenThreeString_whenFindMax2_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        String a = "Banana";
//        String b = "Peach";
//        String c = "Apple";
//        String result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(b, result);
//    }
//    @Test
//    public void givenThreeString_whenFindMax3_returnTrue() {
//        GenericMainClass genericsMainClass = new GenericMainClass();
//        String a = "Apple";
//        String b = "Banana";
//        String c = "Peach";
//        String result = genericsMainClass.findMaxValue(a,b,c);
//        Assert.assertEquals(c, result);
//    }

