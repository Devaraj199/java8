package functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> convertString = input -> input.toUpperCase();
        UnaryOperator<String> sameValue = UnaryOperator.identity();
        UnaryOperator<Integer> multiplyValue = value -> value * 3;
        UnaryOperator<Integer> multiplyValue1 = value -> value * 4;
        System.out.println(convertString.apply("hello"));
        System.out.println(sameValue.apply("Hello"));
        System.out.println(multiplyValue.andThen(multiplyValue1).apply(6));
        System.out.println(multiplyValue.apply(6));
        System.out.println(multiplyValue.compose(multiplyValue1).apply(4));
    }
}
