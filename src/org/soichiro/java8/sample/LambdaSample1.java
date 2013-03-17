package org.soichiro.java8.sample;

/**
 * Functional InterfaceをLambdaのシンタックスを試す
 */
public class LambdaSample1 {

    public interface StringCount {int f(String s1, String s2);}

    public static void main(String[] args) {
        StringCount countDiffLength
                = (s1, s2) -> {return s1.length() - s2.length();};
        int count = countDiffLength.f("hogehege", "hoge");
        System.out.println(count); // 4
    }
}
