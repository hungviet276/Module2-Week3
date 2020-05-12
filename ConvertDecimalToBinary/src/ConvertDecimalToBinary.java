import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binaryStack = new Stack<Integer>();
        int decimalNumber = 30;
        int number = decimalNumber;
        while (number!=0){
            number = number/2;
            binaryStack.push(number%2);

        }
        Stack<Integer> newBinaryStack = new Stack<Integer>();
        System.out.println("Convert "+decimalNumber+" to Binary: ");
        while (binaryStack.size()!=0){
            newBinaryStack.push(binaryStack.pop());
        }
        while(newBinaryStack.size()!=0){
            System.out.print(newBinaryStack.pop());
        }




    }

}
