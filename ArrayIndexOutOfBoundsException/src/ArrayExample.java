import java.util.Scanner;

public class ArrayExample {
    public int[] creatRandom(){
        int[] list = new int[100];
        for (int i = 0; i< list.length;i++){
            list[i] = (int)Math.floor(Math.random()*100);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] list = arrayExample.creatRandom();
        System.out.println("Nhap vao chi so muon in ra: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so: " + number+" la :" + list[number]);
        }catch (IndexOutOfBoundsException e){
            System.err.print("Chi so vuot qua gioi han cua mang");
        }
    }
}
