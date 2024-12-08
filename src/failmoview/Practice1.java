package failmoview;

import javatechie.database.CommonCollection;
import javatechie.database.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        CommonCollection commonCollection = new CommonCollection();
       ;
        List<Employee> employeeList = commonCollection.getEmployees();
       List<String> nameList= employeeList.stream().map(Employee::getName).collect(Collectors.toList());
//        System.out.println(nameList);
   Map<String,List<Long>> nameSalGrouping =      employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getSalary,Collectors.toList())));
//        System.out.println(nameSalGrouping);

        Map<String, Optional<Employee>> maxEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        Map<String, Long> summiningSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.summingLong(Employee::getSalary)));
//        System.out.println(summiningSalary);

//        System.out.println(employeeList);
       List<Employee> sortedEmp =  employeeList.stream()
               .sorted(Comparator.comparing(Employee::getName))
               .collect(Collectors.toList());
//        System.out.println(sortedEmp);
        Optional<Employee> max = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> min = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
//        System.out.println(min.get().getName());
   Map<String,List<Long>> mapList =     commonCollection.getEmployeeMap().entrySet()
                .stream()
               .collect(Collectors.groupingBy(entry->entry.getKey().getName(),Collectors.mapping(entry->entry.getKey().getSalary(),Collectors.toList())));

        Map<Employee, Integer> sortedMap = commonCollection.getEmployeeMap()
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(entry -> entry.getKey().getSalary()))  // Sorting by salary
                .collect(Collectors.toMap(
                        i->i.getKey(),  // Key is Employee
                        i->i.getValue(),  // Value is Integer
                        (oldValue, newValue) -> oldValue,  // Handling duplicate keys
                        LinkedHashMap::new  // Preserving sorted order
                ));
//        commonCollection.getEmployeeMap().forEach((k,v)-> System.out.println(v));
        LinkedHashMap<Employee, Integer> sortedcollect = commonCollection.getEmployeeMap()
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        i -> i.getKey(),
                        i -> i.getValue(),
                        (old, newv) -> old,
                        LinkedHashMap::new));

//        sortedcollect.forEach((k,v)-> System.out.println(v));
        List<String> collect = commonCollection.getEmployeeMap()
                .entrySet()
                .stream()
                .map(i -> i.getKey().getName())
                .collect(Collectors.toList());
//        System.out.println(collect);
        commonCollection.getEmployeeMap().forEach((k,v)->{
            System.out.print(k.getName()+"  ");
        });
        Map<Employee, Integer> collect1 = commonCollection.getEmployeeMap().entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).collect(Collectors.toMap(
                        i -> i.getKey(),
                        i -> i.getValue(),
                        (old, newV) -> old,
                        LinkedHashMap::new
                ));
        collect1.forEach((k,v)->{
            System.out.print(k.getName()+"  ");
        });

    }


}
