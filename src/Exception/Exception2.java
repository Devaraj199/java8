package Exception;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exception2 {
    public static void main(String[] args) {
        Set exampleSet = new HashSet();
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        hashtable.put(1,101);
        Iterator iterator = hashtable.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(hashtable.elements().nextElement());
        }
        Iterator iterator1 = exampleSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
