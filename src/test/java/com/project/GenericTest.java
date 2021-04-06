package com.project;

import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.util.Optional;

public class GenericTest {


    private Object Optional;

    @Test
    public void givenThreeIntegers_whenFindMax1_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Integer myArray[]={10,20,30,40};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[3], result);
    }

    @Test
    public void givenThreeIntegers_whenFindMax2_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Integer myArray[]={10,20,40,30};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[2], result);
    }

    @Test
    public void givenThreeIntegers_whenFindMax3_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Integer myArray[]={500,20,40,30};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[0], result);
    }

    @Test
    public void givenThreeFloat_whenFindMax1_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Float myArray[]={500.0f,20.0f,40.0f,30.0f};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[0], result);
    }

    @Test
    public void givenThreeFloat_whenFindMax2_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Float myArray[]={10.0f,20.0f,40.0f,30.0f};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[2], result);
    }

    @Test
    public void givenThreeFloat_whenFindMax3_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        Float myArray[]={10.0f,40.0f,20.0f,30.0f};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[1], result);
    }

    @Test
    public void givenThreeString_whenFindMax1_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        String myArray[]={"Apple","Peach","Banana","Grapes"};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[1], result);
    }

    @Test
    public void givenThreeString_whenFindMax2_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        String myArray[]={"Apple","Banana","Peach","Grapes"};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[2], result);
    }

    @Test
    public void givenThreeString_whenFindMax3_returnTrue() {
        GenericMainClass genericsMainClass = new GenericMainClass();
        String myArray[]={"Apple","Banana","Grapes","Peach"};
        Object result =  genericsMainClass.findMaxValue(myArray);
        Assert.assertEquals(myArray[3], result);
    }
}
