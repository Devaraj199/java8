package problems;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil",1800);
        map.put("Bhavna",1500);
        map.put("mical",1300);
        map.put("tom",1600);
        map.put("Madan",1600);
        Map<String,Integer> filterMap = map.entrySet().stream()
                .filter(e->e.getValue()>1300)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filterMap);
   Map<Integer,List<String>> groupingBy =
           map.entrySet().
                   stream().
                   filter(i->i.getValue()>1500).
                   collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(
                           Map.Entry::getKey,  // Extract the name
                           Collectors.toList() // Collect names into a list
                   )));
        System.out.println(groupingBy);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        String str = names.stream().collect(Collectors.joining(",", "{", "]"));
        System.out.println(str);
    }
}
