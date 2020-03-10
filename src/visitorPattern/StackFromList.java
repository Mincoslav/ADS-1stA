package visitorPattern;

import java.util.LinkedList;


public class StackFromList<Type>  {

    LinkedList<Type> stack;

    public StackFromList() {
        stack = new LinkedList<>();
    }

    public void push(Type x) {
        stack.push(x);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Type peek() {
        return stack.peekFirst();
    }

    public Type pop() {
        return stack.pop();
    }

    public void display() {

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }

    public int size() {
        return stack.size();
    }
}
