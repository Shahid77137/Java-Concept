package Collection_framework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {

    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<>();

        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.offer(4);

        // Queue follows firdt in first out (FIFO)

        System.out.println(Q);
        System.out.println(Q.poll()); // it removes the first element
        System.out.println(Q);
        System.out.println(Q.peek()); // it gets the first element

        System.out.println("Printing queue = " + Q);
        System.out.println("Size of queue = " + Q.size());
        System.out.println("removing index of queue = " + Q.remove(4)); // it is removing the element of the set
        System.out.println("use of contain method of queue = " + Q.contains(3));
        System.out.println(Q);


        // if we apply priority queue then elements are arranged in descending order

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);

// it arranges only the smallest value at the top or first place and other elements remain random


        System.out.println(pq);


    }

}
