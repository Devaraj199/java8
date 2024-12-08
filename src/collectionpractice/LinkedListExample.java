package collectionpractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
//    add()
//    addFirst()
//    addLast()
//    addAll()
//    get()
//    getFirst()
//    getLast()
//    set()
//    remove()
//    removeFirst()
//    removeLast()
//    clear()
//    size()
//    isEmpty()
//    contains()
//    indexOf()
//    lastIndexOf()
//    toArray()
//    iterator()
//    listIterator()
//    subList()

    {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.addFirst(90);
        integerList.addLast(7);
        integerList.add(12);
        integerList.addFirst(23);
        integerList.addLast(22);
        System.out.println(integerList.getLast());

    }
    public static void main(String[] args) {
        LinkedListExample listExample = new LinkedListExample();
    }
}
