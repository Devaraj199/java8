package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class A {
    private int key;
    private String value;

     public int getKey() {
         return key;
     }

     public A(int key, String value) {
         this.key = key;
         this.value = value;
     }

     public A(){

     }
     public String getValue() {
         return value;
     }

     public void setKey(int key) {
         this.key = key;
     }

     public void setValue(String value) {
         this.value = value;
     }
 }
public class PracticeMore {
    public static void main(String[] args) {
        operateOnStringUsingStream();
        A a = new A();
        List<A> aList = Arrays.asList(new A(1,"Raju"),new A(2,"Mama"),new A(3,"Tata"),new A(4,"Jiji"));
        Map<Integer,Integer> aMap = new HashMap<>();
        aList.forEach(i->aMap.put(i.getKey(),i.getValue().length()));
        System.out.println(aList);
        System.out.println(aMap);

    }
    public static  void operateOnStringUsingStream(){
        String s = "Helloworld";
        String s1[] = {"Hello","World","World","World","World"};
        Map<String,Long> x =  Arrays.stream(s1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        x.forEach((key,value)->System.out.println("Key-"+key+"-----value-"+value));
//        Arrays.stream(s1).map(i->i.split("")).flatMap(Arrays::stream).forEach(i-> System.out.println(i));
        List<Integer> integerList= Stream.of(12,4,56,1,3).sorted().toList();
//        System.out.println(integerList);
    }
}
