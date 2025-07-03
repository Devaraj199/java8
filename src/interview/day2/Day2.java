package interview.day2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day2 {
    public static void main(String[] args) {
        int newArray[]={10,20,30,2,3,7,25};
        int newArr[] = {12,22,34,1,2,32,12};
        int z;
        Arrays.sort(newArr);
        int max = Arrays.stream(newArray).max().getAsInt(); //30
        int min = Arrays.stream(newArray).min().getAsInt();//2
        long count = Arrays.stream(newArray).count();//9
        int sum = Arrays.stream(newArray).sum();//149
       double average = Arrays.stream(newArray).average().getAsDouble();//16.555
        System.out.println(sum);
        List<Integer> integerList = Arrays.stream(newArray)
                .boxed().
                filter(i -> i > 10)
                .toList();//[20,30,25,27,25]
        List<Integer> modifiedValue = Arrays.stream(newArray)
                .boxed()
                .filter(i->i%2==0)
                .map(i->i*2)
                .collect(Collectors.toList());
//        System.out.println(modifiedValue);
      List<Integer> sortedList=  Arrays.stream(newArray)
              .boxed()
              .sorted(Comparator.reverseOrder())
              .collect(Collectors.toList()); // [30, 27, 25, 25, 20, 10, 7, 3, 2]
        int secondHighest =  Arrays.stream(newArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null); // 27
        List<Integer> sortedList1=  Arrays.stream(newArray)
                .boxed()
                .sorted(Comparator.reverseOrder()).toList();
        List<Integer> sortedList2 = Arrays.stream(newArray).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).toList();
        System.out.println(sortedList2);
        System.out.println(sortedList1);
    }
}
