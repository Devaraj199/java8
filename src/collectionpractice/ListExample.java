package collectionpractice;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    List<String> list = Arrays.asList("Test","Hello");
    List<Integer> numberList = new ArrayList<>();
    List<Integer> numberList1 = new ArrayList<>();

    {
        numberList.add(290);
        numberList.add(239);
        numberList.add(256);
        numberList1.add(2222);
        numberList.addAll(numberList1);
//        numberList.remove(1);
//        numberList.clear();
        System.out.println(numberList.isEmpty());
        System.out.println(numberList.size());
        System.out.println(numberList.contains(2901));
        System.out.println(numberList.get(2));
        System.out.println(numberList.set(2,888));
        System.out.println(numberList);
        System.out.println(numberList.indexOf(256));
        System.out.println(numberList.lastIndexOf(290));
//        for(int number:numberList){
//            System.out.println(number);
//        }

//        numberList.forEach(System.out::println);
        Iterator<Integer> integerIterator = numberList.iterator();
//        ListIterator<Integer> listIterator = numberList.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.nextIndex()+"-"+listIterator.next());
//        }
//        while (integerIterator.hasNext()){
////            System.out.println("Hello "+integerIterator.next());
//        }
        List<Integer> filterList = numberList.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList());
        int sum = numberList.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum+"-"+numberList);


    }
    public static void main(String[] args) {
        ListExample listExample = new ListExample();

    }
}
