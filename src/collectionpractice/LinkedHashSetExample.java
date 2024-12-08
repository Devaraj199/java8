package collectionpractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(21);
        linkedHashSet.add(32);
        linkedHashSet.add(6);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
    public static void main(String[] args) {
        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
    }
}
