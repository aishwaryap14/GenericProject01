package com.project;

public class GenericMainClass <x, y, z extends Comparable>  {
    x first;
    y second;
    x third;
    private Object x;

    public GenericMainClass(x first, y second, x third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


        public <E extends Comparable> E findMaxValue (E a, E b, E c) {
        E max = a;
        if(b.compareTo(max) > 0)
        {
            max = b;
        }
        if(c.compareTo(max) > 0)
        {
            max = c;
        }
        // printMax(a, b, c, max);
        return max;
    }


    public void findMaxValue() {
        findMaxValue(x);
        findMaxValue(y);
        findMaxValue(z);
    }


}


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



