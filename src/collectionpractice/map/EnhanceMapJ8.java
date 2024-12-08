package collectionpractice.map;

import java.util.HashMap;
import java.util.Map;

public class EnhanceMapJ8 {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("India","Delhi");
        stringMap.put("Pakistan","Islamabad");
        stringMap.put("USA","Washington");
        stringMap.put("China","Beijing");
        stringMap.put("Japan","Tokyo");
//        stringMap.forEach((key,value)-> System.out.println(key+" "+value));
//        stringMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        stringMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        System.out.println(stringMap.getOrDefault("d","No data present"));
        stringMap.computeIfAbsent("England",name->"London");
        stringMap.computeIfPresent("India",(k,v)->"New Delhi");
        stringMap.compute("USA1",(k,v)->"Washington DC");
        stringMap.remove("England","London");
        stringMap.replace("China","New beijing");
        stringMap.replaceAll((k,v)->v.toUpperCase());
//        stringMap.forEach((key,value)-> System.out.println(key+" "+value));
        stringMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }


}
