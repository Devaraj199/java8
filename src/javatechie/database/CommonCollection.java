package javatechie.database;

import java.util.*;

public class CommonCollection {

    public List<String> getNameList(){
        List<String> list = new ArrayList<>();
        list.add("mohan");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");
        return list;
    }
    public Map<String,Integer> getSimpleMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("anil", 1000);
        map.put("bhavna", 1800);
        map.put("micael", 1200);
        map.put("tom", 1600);
        map.put("ankit", 1200);
        map.put("daniel", 1700);
        map.put("james", 1400);
        return map;
    }

    public List<Integer> getListOfInt(){
        List<Integer> numberList = Arrays.asList(12,3,45,66,88,12);
        return numberList;
    }

    public int[] getPrimitiveNumbers(){
        int[] numbers = {1,3,12,67,89,24,36,75};
        return  numbers;
    }

    public String getSimpleStrings(){
        String str = "Welcome to India";
        return str;
    }

    public List<String> getCountryList(){
        return Arrays.asList("India","US","United Kingdom","South Africa","Pakistan");
    }
    public String[] getCityList(){
        String[] cityList = {"Hyderabad","Chennai","Bangalore","Mumbai","Pune","Kolkata"};
        return  cityList;
    }
    public  List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "CORE", 1000));
        list.add(new Employee(388, "Bikash", "CIVIL", 2000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee(624, "Sourav", "CORE", 600000));
        list.add(new Employee(176, "Prakash", "SOCIAL", 120000));
        list.add(new Employee(789, "Prakash", "CORE", 90000));
        list.add(new Employee(398, "Murali", "CIVIL", 55000));
        list.add(new Employee(34, "Mohan", "SOCIAL", 34000));

        return list;
    }

    public List<Student> getStudentList(){
        List<Student> studentList = Arrays.asList(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929"))
                );
        return studentList;
    }

    public Map<Employee,Integer> getEmployeeMap(){
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
        return employeeMap;
    }

}
