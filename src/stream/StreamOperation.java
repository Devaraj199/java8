package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
//        mapInStream();
        flatMapInStreams();
//          groupByStreams();
    }

    public static void groupByStreams(){
        List<Products> productList = new ArrayList<>();
        productList.add(new Products("Laptop",2000));
        productList.add(new Products("Viva",800));
        productList.add(new Products("Lenovo",700));
        productList.add(new Products("Samsung",2000));
        productList.add(new Products("Oneplus",800));
        productList.add(new Products("Mobile sony",700));

        Map<Integer,List<Products>> productsMap =  productList.stream()
                .collect(Collectors.groupingBy(Products::getPrice));
        System.out.println(productsMap);

    }
    public static void mapInStream(){
        List<String> deptList = new ArrayList<>();
        deptList.add("Supply");
        deptList.add("HR");
        deptList.add("Sales");
        deptList.add("Marketing");
        deptList.stream().map(word->word.toUpperCase()).forEach(System.out::println);
    }

    public static void flatMapInStreams() {
        String[] arrayOfWords = { "Eazy", "Bytes" };
        Stream<String> stringStream = Arrays.stream(arrayOfWords);
        stringStream.map(w->w.split("")).flatMap(Arrays::stream).forEach(System.out::println);
//        System.out.println(stringStream);
        List<List<String>> list = Arrays.asList(List.of("Eazy"),
                List.of("Bytes"));
//        System.out.println(list);
//        list.stream().map(Collection::stream).forEach(System.out::println);
//        list.stream().flatMap(Collection::stream).forEach(System.out::println);

        List<List<List<Integer>>> lists = List.of(Arrays.asList(Arrays.asList(2, 3, 4), Arrays.asList(6, 7, 8)));
        List<Integer> x=  lists.
                stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .filter(integer -> integer%2==0)
                .toList();
        lists.stream().flatMap(Collection::stream).flatMap(Collection::stream).filter(i->i%2==0).forEach(i-> System.out.print(" "+i));
//        System.out.println(x);

    }
}
