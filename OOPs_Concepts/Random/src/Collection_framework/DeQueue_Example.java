package Collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue_Example {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.offer(5);

        System.out.println(dq);

        System.out.println(dq);
        System.out.println(dq.poll()); // it removes the first element
        System.out.println(dq);
        System.out.println(dq.peek()); // it gets the first element

        System.out.println("Printing Dequeue = " + dq);
        System.out.println("Size of Dequeue = " + dq.size());
        System.out.println("removing index of Dequeue = " + dq.remove(4)); // it is removing the element of the set
        System.out.println("use of contain method of Dequeue = " + dq.contains(3));
        System.out.println("Using first peek = "+dq.peekFirst());
        System.out.println("Using last peek = "+dq.peekLast());
        System.out.println("Using first poll = "+dq.pollFirst());
        System.out.println("Using last poll = "+dq.pollLast());
        System.out.println(dq);

    }

}
