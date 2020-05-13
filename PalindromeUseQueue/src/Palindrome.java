import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase();
        String[] myString = string.split("");
        for (int i = 0 ; i< myString.length; i++){
            stack.push(myString[i]);
            queue.add(myString[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean checkPalindrome = true;
        for (int j = 0; j < myString.length;j++){
            if (!stack.pop().equals(queue.remove())){
                checkPalindrome = false;
                break;
            }

        }
        System.out.println(checkPalindrome);

    }
}
