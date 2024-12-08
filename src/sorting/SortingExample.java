package sorting;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private String empName;
    private int empSal;

     public Employee(String empName, int empSal) {
         this.empName = empName;
         this.empSal = empSal;
     }

     public String getEmpName() {
         return empName;
     }

     public int getEmpSal() {
         return empSal;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "empName='" + empName + '\'' +
                 ", empSal=" + empSal +
                 '}';
     }
 }
public class SortingExample {
    public static void main(String[] args) {
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Comparator employeeComp = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if(o1.getEmpSal()<o2.getEmpSal()){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };


        List<Integer> integerList = new ArrayList<>();
        integerList.add(34);
        integerList.add(23);
        integerList.add(45);
        integerList.add(18);
        Collections.sort(integerList,comparator);
//        System.out.println(integerList);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Deva",34));
        employees.add(new Employee("Raju",25));
        employees.add(new Employee("Kiran",20));
        employees.add(new Employee("Mama",60));
        for (Employee employee : employees) {
//            System.out.println(employee);
        }
        Collections.sort(employees,employeeComp);
        for (Employee employee : employees) {
//            System.out.println(employee);
        }

        List<String> listString = Arrays.asList("Deva jalantriya","Agastya","Munna","Navin","Kumar");
        System.out.println(listString);
    }
}
