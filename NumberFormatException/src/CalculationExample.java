import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.caculate(x,y);

    }
    private void caculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x va y: "+a);
            System.out.println("Hieu x va y: "+b);
            System.out.println("Tich x va y: "+c);
            System.out.println("Thuong x va y: "+d);
        }catch (NumberFormatException e){
            System.err.print("Xay ra ngoai le" + e.getMessage());
        }
    }
}
