package com.project;

import jdk.nashorn.internal.runtime.options.Option;
import jdk.nashorn.internal.runtime.options.Options;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GenericMainClass<T, E> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public GenericMainClass() {
    }

    public <E extends Comparable> E findMaxValue(E[] array) {
        List<E> eList = Arrays.asList(array);
       // E max = eList.stream().sorted(Comparator.<E>reverseOrder()).findFirst().get();
       E max = eList.stream().max((i, j)-> i.compareTo(j)).get();
//        E max = a;
//        if (b.compareTo(max) > 0) {
//            max = b;
//        }
//        if (c.compareTo(max) > 0) {
//            max = c;
//        }
//        // printMax(a, b, c, max);
       return  max;
    }

}
//    public void findMaxValue() {
//        findMaxValue(x);
//        findMaxValue(y);
//        findMaxValue(z);
//    }





//    public Integer maxNumber(Integer a, Integer b, Integer c) {
//        Integer max = a;
//        if(b.compareTo(max) > 0)
//        {
//            max = b;
//        }
//        if(c.compareTo(max) > 0)
//        {
//            max = c;
//        }
//       // printMax(a, b, c, max);
//        return max;
//    }
//
//    public Float maxNumberFloat(Float a, Float b, Float c) {
//        Float max = a;
//        if(b.compareTo(max) > 0)
//        {
//            max = b;
//        }
//        if(c.compareTo(max) > 0)
//        {
//            max = c;
//        }
//        // printMax(a, b, c, max);
//        return max;
//    }
//
//    public String maxString(String a, String b, String c) {
//        String max = a;
//        if(b.compareTo(max) > 0)
//        {
//            max = b;
//        }
//        if(c.compareTo(max) > 0)
//        {
//            max = c;
//        }
//        // printMax(a, b, c, max);
//        return max;
//    }



