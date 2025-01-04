package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        List<String> deptList = new ArrayList<>();
        deptList.add("Supply");
        deptList.add("HR");
        deptList.add("Sales");
        deptList.add("Marketing");
//        deptList.forEach(System.out::println);
        Stream<String> deptStream = deptList.stream();
        deptStream.forEach(System.out::println);
        Stream<String> inStream = Stream.of("Dev","Raj","Pradhan");
        inStream.forEach(System.out::println);
        System.out.println("***********");
        Stream<String> deptParlellStream = deptList.parallelStream();
        deptParlellStream.forEach(System.out::println);
        System.out.println("***********");
        String str[] = {"Deva us","Deva is countable","Germany"};
     Long x =  Arrays.stream(str).
              flatMap(line->Arrays.stream(line.split("\\s+")))
             .filter(word->word.equals("Deva")).count();
        System.out.println(x);

    }
}
