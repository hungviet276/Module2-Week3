import java.util.Scanner;

public class TestTriangle {
    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException{
        if (side1+side2<side3 || side1+side3<side2 || side2+side3<side1){
            throw new IllegalTriangleException("Not a Triangle");
        }

    }
    public static void checkSideTriangle(int side) throws IllegalTriangleException {
        if (side<=0){
            throw new IllegalTriangleException("Side <= 0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter side2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter side3: ");
        int side3 = sc.nextInt();
        try {
            checkSideTriangle(side1);
            checkSideTriangle(side2);
            checkSideTriangle(side3);
            checkTriangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }


    }

}
