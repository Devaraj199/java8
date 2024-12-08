package collectionpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("prasad");
        stringSet.add("kumar");
        stringSet.add("muna");
        stringSet.add("mahesh");
        stringSet.add(null);
        System.out.println(stringSet);
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("hello"));
        System.out.println(stringSet.remove("Hello"));
        System.out.println(stringSet);
    }
    public static void main(String[] args) {
        SetExample setExample = new SetExample();
    }
}
