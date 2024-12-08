package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25, "New York"),
                new Person("Jane", 30, "New York"),
                new Person("Jake", 35, "Los Angeles"),
                new Person("Mary", 28, "New York"),
                new Person("Tom", 40, "Los Angeles")
        );
        String s = "Raju" ;
        Map<String,Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
       Map<String,List<String>> map =  people.stream().
               collect(Collectors.groupingBy(Person::getCity,Collectors.mapping(Person::getName,Collectors.toList())));
       map.forEach((k,v)->{
//           System.out.println(k+"----"+v);
       });
        List<String> str = Arrays.asList("Dev dev", "Mohan", "Kumar p");

        // Using flatMap to split and flatten the strings
        List<String> result = str.stream()
                .flatMap(i -> Arrays.stream(i.split(" ")))
                .collect(Collectors.toList());
//        System.out.println(result);

        int[] x = {12,3,0,6,0,3};
        int nonZeroIndex = 0;
        int temp;
        for(int i = 0;i<x.length;i++){
            if(x[i]!=0){
                temp = x[nonZeroIndex];
                x[nonZeroIndex] = x[i];
                x[i]=temp;
                nonZeroIndex++;
            }
        }
        for(int i = 0;i<x.length;i++){
//            System.out.println(x[i]);
        }
        int first = Integer.MIN_VALUE; // The largest number
        int second = Integer.MIN_VALUE;
        for (int num : x) {
            if (num > first) {
                second = first; // Update second to the previous first
                first = num;    // Update first to the new largest number
            } else if (num > second && num < first) {
                second = num;   // Update second if the current number is between first and second
            }
        }
        System.out.println(second);


    }
}
