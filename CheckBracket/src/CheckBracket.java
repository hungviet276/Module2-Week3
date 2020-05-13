import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<String>();
        String operator = "s * (s – a) * (s – b) * (s – c)(";
        String[] sym = operator.split("");
        boolean checkSym = true;
        String left = "";
        String checkLeft = "";
        for (int i = 0; i < sym.length; i++){
            if (sym[i].equals("(")){
                bStack.push(sym[i]);
            }
            if (sym[i].equals(")")){
                if (bStack.empty()){
                    checkSym = false;
                    break;
                } else {
                    left+= bStack.pop();
                }
            }

        }
        for (int i = 0; i < sym.length; i++){
            if (sym[i].equals("(")){
                checkLeft+= "(";

            }
        }
        if (!checkLeft.equals(left)){
            checkSym = false;
        }
        System.out.println(checkSym);







    }


}
