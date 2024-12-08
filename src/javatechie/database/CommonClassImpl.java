package javatechie.database;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonClassImpl {
    public static void main(String[] args) {
        CommonCollection commonCollection = new CommonCollection();
       Map<String, Double> empMap = commonCollection.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));
//        System.out.println(empMap); // {CORE=500000.0, DEFENCE=500000.0, CIVIL=900000.0, SOCIAL=1200000.0}
        Map<String, List<Long>> empMap1 = commonCollection.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getSalary,Collectors.toList())));
//        System.out.println(empMap1);// {CORE=[400000, 600000], DEFENCE=[500000], CIVIL=[900000], SOCIAL=[1200000]}
        Map<String, List<Employee>> empMap2 = commonCollection.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(empMap2); // {CORE=[Employee [id=176, name=Roshan, dept=CORE, salary=400000], Employee [id=624, name=Sourav, dept=CORE, salary=600000]], DEFENCE=[Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000]], CIVIL=[Employee [id=388, name=Bikash, dept=CIVIL, salary=900000]], SOCIAL=[Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]]}
        Map<String, List<Long>> empMap3 = commonCollection.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getSalary,Collectors.toList())));
//        System.out.println(empMap3);// {Roshan=[400000], Bimal=[500000], Sourav=[600000], Bikash=[900000], Prakash=[1200000]}
        Map<Integer, List<Long>> empMap4 = commonCollection.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.mapping(Employee::getSalary,Collectors.toList())));
//        System.out.println(empMap4);// {624=[600000], 176=[400000, 1200000], 388=[900000], 470=[500000]}
//       ===================================== End of GroupingBy ================================================

//       ====================================== Sorting =========================================================
        List<Employee> employeeList = commonCollection.getEmployees()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .collect(Collectors.toList());

//[Employee [id=176, name=Roshan, dept=CORE, salary=400000],
// Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000],
// Employee [id=388, name=Bikash, dept=CIVIL, salary=900000],
// Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000],
// Employee [id=624, name=Sourav, dept=CORE, salary=600000]]

        List<Employee> employeeList1 = commonCollection.getEmployees()
                .stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
//        [Employee [id=176, name=Roshan, dept=CORE, salary=400000],
//        Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000],
//        Employee [id=624, name=Sourav, dept=CORE, salary=600000],
//        Employee [id=388, name=Bikash, dept=CIVIL, salary=900000],
//        Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]]
        List<Employee> employeeList2 = commonCollection.getEmployees()
                .stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());
//        System.out.println(employeeList2);
//        [Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000],
//        Employee [id=388, name=Bikash, dept=CIVIL, salary=900000],
//        Employee [id=624, name=Sourav, dept=CORE, salary=600000],
//        Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000],
//        Employee [id=176, name=Roshan, dept=CORE, salary=400000]]
        List<Employee> employeeList3 = commonCollection.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
//        [Employee [id=388, name=Bikash, dept=CIVIL, salary=900000],
//        Employee [id=176, name=Roshan, dept=CORE, salary=400000],
//        Employee [id=624, name=Sourav, dept=CORE, salary=600000],
//        Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000],
//        Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]]
//        System.out.println(employeeList3);
        List<Employee> employeeList6 = commonCollection.getEmployees();
//        Collections.sort(employeeList6,Comparator.comparing(Employee::getSalary).reversed());
       Employee empMin = Collections.min(employeeList6,Comparator.comparingLong(Employee::getSalary));
//       Employee [id=176, name=Roshan, dept=CORE, salary=400000]
        Employee empMax = Collections.max(employeeList6,Comparator.comparingLong(Employee::getSalary));
//        Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]
        List<Employee> employeeList7 = commonCollection.getEmployees();
        Map<String, Optional<Employee>> empMap10 = employeeList7.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        empMap10.forEach((dep,highest)->{
            System.out.println(dep+"is highest value is:"+highest);
        });

//========================================End=======================================================================
//                                        With integers and int
//==========================================================================================================
//        Original (12,3,45,66,88,12);
        List<Integer> sortedArray = commonCollection.getListOfInt()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());// [88, 66, 45, 12, 12, 3]
        List<Integer> sortedArray1 = commonCollection.getListOfInt()
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()); // [3, 12, 12, 45, 66, 88]
//        System.out.println(commonCollection.getListOfInt()
//                .stream().filter(i->i%2==0)
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList())); //[12, 12, 66, 88]
//        System.out.println(commonCollection.getListOfInt()
//                .stream().filter(i->i%2==0)
//                        .distinct()
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList())); // [12, 66, 88]
//        System.out.println(commonCollection.getListOfInt()
//                .stream().filter(i->i%2==0)
//                .distinct()
//                        .skip(1)
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList())); // [66, 88]a
//        System.out.println(commonCollection.getListOfInt().stream()
//                .max(Comparator.naturalOrder()).get());
     int sum =  commonCollection.getListOfInt().stream().reduce(0,(a,b)->a+b);
//        System.out.println(sum); //226
        int reduce = commonCollection.getListOfInt().stream().filter(i -> i % 2 == 0)
                .map(i->i*2).reduce(0, (a, b) -> a + b);
//        System.out.println(reduce);// 356

//With primitive integers
        // {1,3,12,67,89,24,36,75};
        int[] duplicateNumber = commonCollection.getPrimitiveNumbers();
        for(int n: duplicateNumber){
//            System.out.println(n);
        }
//        Arrays.stream(duplicateNumber).boxed().filter(i->i%2==0).forEach(System.out::println);
//        Arrays.stream(duplicateNumber).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
          int min = Arrays.stream(duplicateNumber).min().getAsInt();//1
       int max =  Arrays.stream(duplicateNumber).max().getAsInt();//89
        int total = Arrays.stream(duplicateNumber).sum();//307
        int total1 = Arrays.stream(duplicateNumber).reduce(0,(a,b)->a+b);//307
//        System.out.println(total1);
        IntStream intStream = IntStream.of(12,12,2,33,4,35);
//        intStream.filter(num->num%2==0).forEach(System.out::println);
        List<Integer> myIntegers = commonCollection.getListOfInt();
        IntStream intStream1 = myIntegers.stream().mapToInt(Integer::intValue);
        intStream1.forEach(list-> System.out.println("value is "+list));
      int xyz =  myIntegers.stream().mapToInt(i->i).sum();
        System.out.println(xyz);

    }
}
