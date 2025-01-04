package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1,5,7,10};
        int[] array2 = {2,3,1,4};
        int[] results = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed())
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(results));
    }
}
