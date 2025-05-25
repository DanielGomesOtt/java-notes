package stack;

import java.util.Stack;

public class FirstStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while(!stack.empty()) {
            System.out.println(stack);
            stack.pop();
        }
    }
}
