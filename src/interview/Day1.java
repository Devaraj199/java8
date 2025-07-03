package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day1 {
    public static void main(String[] args) {
        stringManipulation();
          morePractice();
          morePractice1();

    }

    public static void stringManipulation(){
//        Q1: Java program to count occurrence of String?
        String str = "welcometoindia";
       Map<String,Long> map =   Arrays.stream(str.split(""))
             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
//        Q2: Java program to find duplicate of String?
      List<String> duplicateString =   Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate chars are---"+duplicateString);

//        Q3: Java program to find Unique character of String?

        List<String> uniqueString =   Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Unique chars are---"+uniqueString);

        //        Q4: Java program to find First non repeat of String?

      String firstNonRepeatChar =   Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .findFirst()
                .get().getKey();
        System.out.println(firstNonRepeatChar);

        //Q5. Find second-highest number in array.
        int sampleArray[] = {12,34,5,67,23};
     int x =  Arrays.stream(sampleArray)
              .boxed()
              .sorted(Comparator.reverseOrder())
              .skip(1)
              .findFirst()
               .get();
        System.out.println(x);
        //Q6. Find second-highest number in array without stream.
        int temp;
        int saArray[] = {12,34,5,67,23};
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(saArray[i]>saArray[j]){
                    temp = saArray[i];
                    saArray[i]=saArray[j];
                    saArray[j]=temp;
                }
            }
        }
        System.out.println(saArray[saArray.length-2]);
    }
    public static void morePractice(){
        // Q6: Find the longest string from array of string?
        String[] stringArray = {"deva","gdhhh hfhhf going","Welcome to India","Hello"};
       String longestString =  Arrays.stream(stringArray)
               .reduce((word1,word2)->word1.length() > word2.length() ? word1:word2).get();
        System.out.println(longestString);

        String firstString = stringArray[0];
        for(int i =0;i<stringArray.length;i++){
            if(firstString.length()<stringArray[i].length()){
                firstString = stringArray[i];
            }
        }
        System.out.println(firstString);
        String longestLengthString = stringArray[0];
        for(String s: stringArray){
            if(s.length()>longestLengthString.length()){
                longestLengthString = s;
            }
        }
        System.out.println(longestLengthString);

    }
    public static void morePractice1(){
//        Q7: Find number starting with 1 in list of integer?
      int x[] ={ 123,4,1,23,14,56};
    List<String> y=  Arrays.stream(x)
            .boxed()
            .map(String::valueOf)
            .filter(v->v.startsWith("2"))
            .collect(Collectors.toList());
        System.out.println(y);
//        Q8:String.join method
        List<String> asList = Arrays.asList("12","2","23");
        String str = String.join("-",asList);
        System.out.println(str);

//        Q8: Print range between 1-9 dont print first and last?

        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);


    }

}
