package visitorPattern;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackFromListTest {

    Stack<Integer> stack = new Stack<Integer>();
    StackFromList<Integer> newStack = new StackFromList<Integer>();
    Integer number1 = 10;
    Integer number2 = 20;

    @org.junit.Test
    public void sizeAfter1Push() {
        newStack.push(number1);
        assertEquals(1, newStack.size());
    }

    @org.junit.Test
    public void sizeAfter2Push() {
        newStack.push(number1);
        newStack.push(number2);
        assertEquals(2, newStack.size());
    }

    @org.junit.Test
    public void isEmpty() {
        if (newStack.isEmpty() == true){
            assert true;
        }
        else
            fail();
    }

    @org.junit.Test
    public void isEmptyAfterPush(){
        newStack.push(number1);
        if (newStack.isEmpty() == true){
            fail();
        }
        else if (newStack.isEmpty() == false){
            assert true;
        }
    }

    @org.junit.Test
    public void peek() {
        newStack.push(number1);
        if (newStack.peek() == number1){
            assert true;
        }
        else
            fail();
    }

    @org.junit.Test
    public void pop() {
        newStack.push(number1);
        int poppedNumber = newStack.pop();
        if (poppedNumber == number1 && newStack.isEmpty()){
                assert true;
        }
        else
            fail();
    }

    @org.junit.Test
    public void display() {
        fail();
    }
}