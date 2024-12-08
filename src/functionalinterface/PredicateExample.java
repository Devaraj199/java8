package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i-> i%2 == 0;
        Predicate<Integer> isGreaterThan60 = i -> i>60;
        Predicate<Integer> isLessThan40 = i -> i<40;
        Predicate<String> isEqualCheck = Predicate.isEqual("Devaraj");
        System.out.println(isEven.test((58)));
        System.out.println(isGreaterThan60.and(isEven).or(isLessThan40).test(38));
        System.out.println(isEven.negate().test(68));
        List<Integer> list = Arrays.asList(12,11,22,34,21);
        List<Integer> filterList = list.stream().filter(isLessThan40).collect(Collectors.toList());
        System.out.println(filterList);
        System.out.println(isEqualCheck.test("Devraj"));
    }
}
