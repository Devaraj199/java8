package StringsExamples;

import java.util.Arrays;
import java.util.List;

public class StringExercise {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String originalString = "madam";
        StringBuilder sb = new StringBuilder(originalString);
        String strReversed = sb.reverse().toString();
        System.out.println(strReversed.equals(originalString));
        System.out.println(!originalString.isEmpty());
        Boolean b = originalString.matches("madam");
        System.out.println("----------"+b);
       String replace = originalString.replace("madam","b");
        System.out.println(replace);
        for(int i=0;i<originalString.length();i++){
//            System.out.println(originalString.charAt(i));
        }

        for(char c:originalString.toCharArray()){
            System.out.println(c);
        }
        List<String> words = Arrays.asList("Hello", "World", "Java");
        String result = String.join(", ",words);
        System.out.println(result); // Output: Hello, World, Java
        String str = "Java is a versatile language.";
        System.out.println(str.split(" ").length);
    }
}
