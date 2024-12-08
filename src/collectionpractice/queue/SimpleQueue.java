package collectionpractice.queue;

import java.util.*;

public class SimpleQueue {
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(17);
        queue.add(9);
        System.out.println(queue);
//        queue.clear();
        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
//        queue.element();
//        int x = queue.element();//12
        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        int x = queue.peek();//12
//        queue.remove(); // fifo
        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
       int y = queue.poll();
        System.out.println(y);
        queue.stream().map(i->i*2).forEach(System.out::println);

        // iterator same as list
        // ArrayQueue
        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.add("Mango");
        stringQueue.add("Apple");
        stringQueue.add("banana");
//        stringQueue.add(null);
        System.out.println(stringQueue);
        stringQueue.stream().map(i->i==null ?"NULL":i.toUpperCase()).forEach(System.out::println);
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

//        System.out.println(queue.poll());  // Outputs 1 (smallest element)
//        priorityQueue.forEach(i->System.out.println(i));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);


    }
    public static void main(String[] args) {
        SimpleQueue sq = new SimpleQueue();
    }
}
