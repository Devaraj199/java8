package collectionpractice;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    {
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(23);
        integerVector.add(26);
        integerVector.add(29);
        integerVector.add(28);
        System.out.println(integerVector);
        Iterator<Integer> vectorIterator = integerVector.iterator();
        while(vectorIterator.hasNext()){
            System.out.println(vectorIterator.next());
        }
    }
    public static void main(String[] args) {
        VectorExample ve = new VectorExample();
    }
}
