package org.soichiro.java8.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 関数を引数に関数を作る関数を作ってみる
 * @param <T>
 */
public class LambdaSample4<T> {

    public interface Function{Integer apply(Integer i);};

    public static void main(String[] args) {
        Function doubleAfterPlus5 = createDouble((i) -> {return i + 5;});
        System.out.println(doubleAfterPlus5.apply(7)); // 19
    }

    /**
     * 二倍したあと、渡された関数を適用する関数を返す
     * @param inputFunction
     * @return
     */
    public static Function createDouble(Function inputFunction) {
        return (i) -> {return inputFunction.apply(i * 2);};
    }
}
