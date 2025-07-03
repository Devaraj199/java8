package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
//        practiceInterview();
        practiceInterview1();
        List<String> list = Arrays.asList("A", "B", "C");
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);
//        Iterator<String> listIterator = list.iterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

    }
   public static void practiceInterview1(){

        List<Integer> listofLength = Stream.of("Mango","Banana","Apple")
                .map(String::length)
                .toList();
//       System.out.println(listofLength);
       List<String> distinctValue = Stream.of("a","a","b","b","b","c").distinct().toList();
//       System.out.println(distinctValue);

       List<Integer> listofInteger = Stream.iterate(1,n->n+1).limit(9).collect(Collectors.toList());
       System.out.println(listofInteger);
       Map<Integer,List<String>> grouped = Stream.of("Apple","Banana","Sapota","Pineaaple")
               .collect(Collectors.groupingBy(String::length));
//       System.out.println(grouped);
       Set<String> stringSet = Stream.of("abc","Raju","Kiran","abc").collect(Collectors.toSet());
       System.out.println(stringSet);
       Optional<String> joingString = stringSet.stream().reduce((s1, s2) -> s1 + s2);
//       System.out.println(joingString.get());
       Optional<String> first = Stream.of("apple", "banana", "cherry")
               .findFirst();

       Optional<String> any = Stream.of("apple", "banana", "cherry")
               .findAny();
       boolean allMatch = Stream.of("Raju","Kiran")
               .allMatch(n -> n.startsWith("R"));

       boolean noneMatch = Stream.of(1, 2, 3, 14, 15)
               .allMatch(n -> n > 10);
       System.out.println(allMatch);
       System.out.println(noneMatch);
       int sum = Stream.of(1,2,3,4).reduce(10,Integer::sum);
       System.out.println(sum);
       List<String> stringList = new ArrayList<>(Arrays.asList("a","b"));
       List<String> stringList1 = Arrays.asList("c","d");
//        stringList.addAll(stringList1);
       System.out.println(stringList);
       //Merge
       List<String> mergeString = Stream.of(stringList,stringList1).flatMap(List::stream).toList();
//       System.out.println(mergeString);
       String sentence = "This is a this sample sentence";
       Map<Character, Long> letterMap =  sentence.toLowerCase()         // Convert to lowercase
               .replaceAll("\\s+", "")
               .chars()
               .mapToObj(i->(char) i)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//       System.out.println("+++++++++"+sentance1);
//       Map<Character, Long> letterMap = sentence.toLowerCase()         // Convert to lowercase
//               .replaceAll("\\s+", "")    // Remove all spaces
//               .chars()                   // Stream over each character as int
//               .mapToObj(c -> (char) c)   // Convert int to char
//               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       Map<String,Long> senMap =  Arrays.stream(sentence.split(" ")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       letterMap.forEach((k,v)-> {
            System.out.println(k+"----"+v);
    });
   }




    public static void practiceInterview(){
//   Q1: Find emp or empName of list whose salary is max?
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Raju",7800,"Software"));
        employeeList.add(new Employee("Naveen",7000,"Lawer"));
        employeeList.add(new Employee("Kiran",9000,"Teacher"));
        employeeList.add(new Employee("Pushpa",7500,"Trainer"));
        Employee highestSalaryEmp = employeeList.stream().max(Comparator.comparing(Employee::getEmpSalary)).orElse(null);
        System.out.println(highestSalaryEmp);
        List<Employee> listOfEMp = employeeList.stream()
                .filter(name->name.getEmpName()
                        .startsWith("R"))
                .toList();

//       for(Employee e:listOfEMp){
//           System.out.println(e.getEmpName());
//       }
//        listOfEMp.forEach(i-> System.out.println(i.getEmpName()));
//        listOfEMp.stream().forEach(name-> System.out.println(name.getEmpName()));
          listOfEMp.stream().map(i->i.getEmpDesignation().toUpperCase()).forEach(System.out::println);
        //    Q2: Find the total number of count using count
            long count = employeeList.stream().count();
             System.out.println(count);
//             Q3: Find all the department names
        List<String> deptNames = employeeList.stream().
                map(Employee::getEmpDesignation)
                .filter(empDesignation -> empDesignation.startsWith("T"))
                .collect(Collectors.toList());
        System.out.println(deptNames);
        List<String> empNames = employeeList.stream()
                .filter(i->i.getEmpSalary()<8000 && i.getEmpName().startsWith("R"))
                .map(Employee::getEmpName)
                .collect(Collectors.toList());
        System.out.println(empNames);

    }



}
