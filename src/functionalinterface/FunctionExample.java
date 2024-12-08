package functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String>  convertString = input -> input.toUpperCase();
        Function<String, String> sameValue = Function.identity();
        Function<Integer,Integer> multiplyValue = value -> value * 3;
        Function<Integer,Integer> multiplyValue1 = value -> value * 4;
        System.out.println(convertString.apply("hello"));
        System.out.println(sameValue.apply("Hello"));
        System.out.println(multiplyValue.andThen(multiplyValue1).apply(6));
        System.out.println(multiplyValue.apply(6));
        System.out.println(multiplyValue.compose(multiplyValue1).apply(4));

    }
}
