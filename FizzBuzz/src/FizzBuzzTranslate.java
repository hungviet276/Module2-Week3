public class FizzBuzzTranslate {
    public static String FizzBuzz(int number){
        String stringNumber = String.valueOf(number);
        boolean isTestFizz = false;
        boolean isTestBuzz = false;
        for (int i = 0;i <stringNumber.length();i++){
            char test =stringNumber.charAt(i);
            if (isCharThree(test)){
                isTestFizz = true;
            } else if (isCharFive(test)){
                isTestBuzz =true;
            }
        }
        String checkFizzBuzz = "";
        if (isFizzBuzz(number) ){
            checkFizzBuzz = "FizzBuzz";
        } else if (isBuzz(number) || isTestBuzz){
            checkFizzBuzz = "Buzz";
        } else if (isFizz(number) || isTestFizz){
            checkFizzBuzz = "Fizz";
        } else checkFizzBuzz = String.valueOf(number);
        return checkFizzBuzz;
    }

    private static boolean isCharFive(char test) {
        char charFive = '5';
        return test == charFive;
    }

    private static boolean isCharThree(char test) {
        char charThree = '3';
        return test == charThree;
    }

    private static boolean isFizz(int number) {
        return number%3 ==0;
    }

    private static boolean isBuzz(int number) {
        return number%5 ==0;
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

}
