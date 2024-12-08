package interviewtcspractice;

import javatechie.database.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
        Double collect = employeeMap.entrySet().stream().collect(Collectors.averagingDouble(i -> i.getKey().getSalary()));
        System.out.println(collect);
    }
}
