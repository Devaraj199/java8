package functionalinterface;

import java.util.function.Function;

public class BinaryOperator {
    public static void main(String[] args) {
        java.util.function.BinaryOperator<String> appendAndConvert = (word1,word2)->(word1+" "+word2).toUpperCase();
        System.out.println(appendAndConvert.apply("Hello","Devaraj"));
        java.util.function.BinaryOperator<Integer>  maxOp = java.util.function.BinaryOperator.minBy((a,b)->(a>b)?1:((a==b)?0:-1));
        System.out.println(maxOp.apply(12,18));
        Function.identity();
    }
}
