package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class FirstDequeue {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Daniel");
        deque.add("João");
        deque.add("Maria");
        deque.add("Nicolas");

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pop());


    }
}
