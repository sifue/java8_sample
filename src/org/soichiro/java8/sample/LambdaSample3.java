package org.soichiro.java8.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Lambdaシンタックスの利用できるmapを実装してみる
 * @param <T>
 */
public class LambdaSample3<T> {

    private List<T> list = new ArrayList<T>();
    public interface MappedFunction<T>{ T f(T e);};

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(new Integer[]{2,3,1,4,5,6});
        LambdaSample3<Integer> listContainer = new LambdaSample3<Integer>();
        listContainer.list.addAll(intList);

        listContainer.map((i) -> {return i * 5;});
        System.out.println(listContainer.list); // [10, 15, 5, 20, 25, 30]
    }

    /**
     * フィールドのlistインスタンスの全てのエレメントに関数を適用する
     * @param mappedFunction
     */
    public void map(MappedFunction<T> mappedFunction) {
        List<T> newList = new ArrayList<T>();
        for (T t : list) {
            newList.add(mappedFunction.f(t));
        }
        list.clear();
        list.addAll(newList);
    }
}
