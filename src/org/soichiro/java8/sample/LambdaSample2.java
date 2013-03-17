package org.soichiro.java8.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ComparatorをLambdaのシンタックスで実装してみる
 * @param <T>
 */
public class LambdaSample2<T> {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(new Integer[]{2,3,1,4,5,6});
        Collections.sort(intList, (i1, i2) -> {return i1 - i2 ;});
        System.out.println(intList); // [1, 2, 3, 4, 5, 6]
    }
}
