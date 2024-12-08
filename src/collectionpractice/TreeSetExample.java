package collectionpractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TreeSetExample {
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(90);
        treeSet.add(8);
        treeSet.add(78);
        treeSet.add(12);
        System.out.println(treeSet);
        System.out.println("----------------");
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Sapota");
        fruits.add("Orange");
//        Map<Integer, String> map = fruits.stream().collect(Collectors.toMap(String::length, Function.identity()));
        Map<Integer, List<String>> groupedByLength = fruits.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        System.out.println(fruits);
        System.out.println(fruits.last());
        System.out.println(fruits);
        System.out.println(fruits.tailSet("Banana"));
        SortedSet<String> x = fruits.stream().map(i->i.toUpperCase()).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(x);

    }
    public static void main(String[] args) {
        TreeSetExample treeSetExample = new TreeSetExample();
    }
}
