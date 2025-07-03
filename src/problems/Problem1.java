package problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        String[] str = {"apple","banana","apple","sapota","apple"};
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] y = {2,3,4};
       int sum = Arrays.stream(y).sum();
        List<Integer> numbers = Arrays.asList(2, 10, 4, 5, 8);
        Integer i1 = numbers.stream().max(Comparator.comparing(i -> i)).get();
        System.out.println(i1);
      int result =  numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
        Arrays.stream(y).forEach(System.out::println);
//        System.out.println(Arrays.stream(nums).anyMatch(i->i>3));
        System.out.println(Arrays.stream(nums).map(i->i*2).map(i->i/2).sum());
        System.out.println(Arrays.stream(str).filter(fruit->fruit=="bananaa").count());
        List<Integer> collect = Stream.of(Arrays.asList(Arrays.asList(2, 4, 43, 56), Arrays.asList(12, 13, 14)))
                .flatMap(List::stream)
                .flatMap(List::stream)
                .filter(val -> val % 2 == 0)
                .toList();
        List<List<Integer>> list = Arrays.asList(Arrays.asList(2, 4, 43, 56), Arrays.asList(12, 13, 14));

        list.stream().flatMap(List::stream).filter(i -> i > 30).toList()
//        System.out.println(collect);
        List<List<String>> lists = Arrays.asList(List.of("Hello", "Kumar","Kumar", "Pradhan"), List.of("Madam"));
        Map<String, Integer> collect1 = lists.stream().flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toMap(w -> w, String::length,(a, b)->a));

        System.out.println(collect1);
    }
}
