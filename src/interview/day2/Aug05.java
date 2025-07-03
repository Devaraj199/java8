package interview.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aug05 {
    public static void main(String[] args) {
         String[] array = {"Java","Spring Java","Spring python"};

        Map<String, Integer> collect = Arrays.stream(array).flatMap(i -> Arrays.stream(i.split(" ")))
                .collect(Collectors.toMap(i->i, String::length,(a, b)->a));
//        collect.forEach((k,v)-> System.out.println(" "+k+"  "+v));

//        IntStream range = IntStream.range(0, 11);
        IntStream range = IntStream.rangeClosed(0, 10);
//        range.forEach(System.out::println);

        String[] s = {"ravi","debajit","mohan","debajit"};
        Map<String, Long> collect1 = Arrays.stream(s).sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect1.forEach((k,v)-> System.out.println(k+" "+v ));

    }
}
