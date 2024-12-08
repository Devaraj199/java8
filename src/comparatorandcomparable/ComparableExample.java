package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
//        Comparator<Movie> ratingComparator = (m1,m2)-> Double.compare(m1.getRating(), m2.getRating());
        Comparator<Movie> ratingComparator = (m1, m2) -> {
            if (m1.getRating() < m2.getRating()) return -1;
            if (m1.getRating() > m2.getRating()) return 1;
            return 0;
        };
        Comparator<Movie> nameComparator = (m1,m2)->m1.getName().compareTo(m2.getName());
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        System.out.println("****** Sorting year by Comparable ***** ");
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("****** Sorting rating by comparator ***** ");
        Collections.sort(list,ratingComparator);
        list.forEach(System.out::println);
        System.out.println("****** Sorting name by comparator ***** ");
        Collections.sort(list,nameComparator);
        list.forEach(System.out::println);

    }
}
