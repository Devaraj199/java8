package problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        String str[] = {"apple","banana","apple","sapota","apple"};
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] y = {2,3,4};
       int sum = Arrays.stream(y).sum();
        List<Integer> numbers = Arrays.asList(2, 10, 4, 5, 8);
       int max =  numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(max);
        System.out.println(sum);
        Arrays.stream(y).forEach(System.out::println);
//        System.out.println(Arrays.stream(nums).anyMatch(i->i>3));
        System.out.println(Arrays.stream(nums).map(i->i*2).map(i->i/2).sum());
        System.out.println(Arrays.stream(str).filter(fruit->fruit=="bananaa").count());
        List<Integer> collect = Arrays.asList(Arrays.asList(Arrays.asList(2, 4, 43, 56), Arrays.asList(12, 13, 14)))
                .stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .filter(val -> val % 2 == 0)
                .collect(Collectors.toList());
//        System.out.println(collect);
        List<List<String>> lists = Arrays.asList(Arrays.asList("Hello", "Kumar","Kumar", "Pradhan"), Arrays.asList("Madam"));
        Map<String, Integer> collect1 = lists.stream().flatMap(i -> i.stream())
                .map(va -> va.toUpperCase())
                .collect(Collectors.toMap(w -> w, w -> w.length(),(a,b)->a));

        System.out.println(collect1);
    }
}
