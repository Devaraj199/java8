package javatechie.database;

import java.util.*;
import java.util.stream.Collectors;

public class CommonClassImpl2 {
    public static void main(String[] args) {
        CommonCollection commonCollection = new CommonCollection();
     Map<String,Integer> map=  commonCollection.getSimpleMap();
// Filter Entries with Value Greater than 1200
// Question: Write a Stream API expression to filter the entries where the value is greater than 1200
// and print the filtered entries.
//        map.entrySet().stream().filter(entry->entry.getValue()>1200).forEach(System.out::println);
        List<String> names = map.entrySet().stream().filter(entry->entry.getValue()>1200)
                .map(i->i.getKey()).collect(Collectors.toList());
//        System.out.println(names);
        List<Integer> values = map.entrySet().stream()
                .filter(entry->entry.getValue()>1200)
                .map(i->i.getValue())
                .collect(Collectors.toList());
//        System.out.println(values);
//        Find Maximum Value
//        Question: Using the Stream API, find the maximum value in the map and print it.
       int x =  map.values().stream().min(Integer::compareTo).orElse(0);
       // Find the Key with the Highest Value:

        Optional<Map.Entry<String, Integer>> max = map.entrySet().stream().max(Map.Entry.comparingByKey());
        System.out.println(max.get().getKey());
        OptionalDouble average = map.values().stream().mapToInt(Integer::intValue).average();
        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().filter(entry->entry.getValue()>1200).collect(Collectors.toList());
        System.out.println(collect);


    }
}
