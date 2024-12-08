package StringsExamples;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class StringTokeniser {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer( "Devaraj* pradhan@j","@",true);
//        while(st1.hasMoreElements()){
//            System.out.println(st1.nextElement());
//        }

        String s1 = "Deva";
        String s2 = "Deva";
        System.out.println(s1==s2); // true
        // s1.equals(s2)// true
        String s3 = new String("Hellomama").intern();
        String s4 = new String("Hello");
        System.out.println(s3.equals(s1));
        System.out.println(s2.compareTo(s1));
        String p =    s1.replace('D','P');
        System.out.println(p);
       int m =  p.concat("Jjsd").length();
        System.out.println(m);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("Mohan garu");
        sb.append("Ela unnaru");
        sb = sb.reverse();
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer();
        sbf.append("madam");
        StringBuffer sr = sbf.reverse();
        System.out.println(sbf.equals(sr));
        System.out.println(Integer.max(10,23));
        System.out.println(Integer.min(12,23));
        System.out.println(Math.max(12,23));
        System.out.println(Math.abs(-2));
        System.out.println(Math.floor(23.330));
        int x[] = {};
//        int  y = Arrays.stream(x).reduce(0,(a,b)->a+b);
        int min = Arrays.stream(x)
                .min().orElse(0);
        int max = Arrays.stream(x)
                .max().orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println(max);
    }
}
