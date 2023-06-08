package Collection_framework;

import java.util.Stack;

public class Stack_Example {

    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        stk.add(5);
        System.out.println(stk);
        System.out.println("Removing last element "+stk.pop());
        System.out.println(stk);
        System.out.println("Viewing last element "+stk.peek());

        System.out.println("Printing stack = " + stk);
        System.out.println("Size of stack = " + stk.size());
        System.out.println("removing index of stack = " + stk.remove(1)); // it is removing the element of the set
        System.out.println("use of contain method of stack = " + stk.contains(3));
        System.out.println(stk);
    }

}
