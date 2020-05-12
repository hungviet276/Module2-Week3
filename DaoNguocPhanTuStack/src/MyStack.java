import java.util.ArrayList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        Stack<Integer> newStack = new Stack<Integer>();
        while (!stack.empty()){
            newStack.push(stack.pop());
        }
        System.out.println(newStack);

        Stack<String> wStack = new Stack<String>();
        String string = "Hello World";
        String[] word = string.split("");
        for (int j =0;j < word.length;j++){
            wStack.push(word[j]);
        }
        System.out.println(wStack);
        Stack<String> newwStack = new Stack<String>();
        while (!wStack.empty()){
            newwStack.push(wStack.pop());
        }
        System.out.println(newwStack);
    }
}
