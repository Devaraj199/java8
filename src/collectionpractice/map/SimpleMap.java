package collectionpractice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SimpleMap {
    {
        Map<Integer,String> stringMap  = new HashMap<>();
        stringMap.put(1,"Raju");
        stringMap.put(2,"Deva");
        stringMap.put(3,"Mahesh");
        stringMap.put(4,"Kumar");
        stringMap.put(null,"I am null");
        stringMap.put(null,"I am null");
        stringMap.putIfAbsent(6,"Dom");
        System.out.println(stringMap);
        System.out.println(stringMap.containsKey(1));
        System.out.println(stringMap.containsValue("Mahesh"));
//        stringMap.compute(3,(k,v)->v==null ? "Hey":"Hello "+v); // Hello Mahesh will update for key 3
        stringMap.computeIfPresent(2,(key,value)->"I am changing"+value);
        stringMap.computeIfAbsent(7,v->"Todo");
        System.out.println(stringMap.remove(2));
        System.out.println(stringMap);
        Set<Integer> keySet = stringMap.keySet();
        for (Map.Entry<Integer,String> entry: stringMap.entrySet()){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
//        System.out.println(keySet);
        for(Integer key:keySet){
            System.out.println("Hello "+stringMap.get(key));
        }
        stringMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .map(i->i.toUpperCase())
                .forEach(System.out::println);

        Iterator<Map.Entry<Integer,String>> iterator = stringMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }
        for(String value:stringMap.values()){
            System.out.println("value---"+value);
        }
    }
    public static void main(String[] args) {
        SimpleMap simpleMap = new SimpleMap();
    }
}
