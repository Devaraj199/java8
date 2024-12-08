package collectionpractice.map;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapExample {
    {
        TreeMap<String,String> treeMap = new TreeMap<>();

        treeMap.put("C","Sapota");
        treeMap.put("D","Pineapple");
        treeMap.put("A","Mango");
        treeMap.put("B","Apple");
        treeMap.forEach((k,v)-> System.out.println(k));
        List<Employee> employeeList = Arrays.asList(
                new Employee("Devaraj","123",10000,"Finance","cashier"),
                new Employee("Mohan","233",3000,"Software","Team lead"),
                new Employee("Mohan","234",6000,"Teacher","HM"),
                new Employee("Kumar","567",9000,"Rmp","RMp doctor"),
                new Employee("Kiran","890",8000,"Layer","Judge")
        );
        Map<String,List<Employee>>  employeeMapGroupBy = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getEmpId));
        Map<String, Employee> convertMap =
                employeeList.stream()
                .collect(Collectors.toMap(Employee::getEmpId,employee -> employee));
        System.out.println(employeeMapGroupBy);

    }

    public static void main(String[] args) {
        TreeMapExample treeMapExample = new TreeMapExample();
    }
}
