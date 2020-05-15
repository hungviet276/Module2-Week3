public class InsertSort {
    public static int[] list = {6,5,7,5,6,8,4,6,9,2,1};
    public static void insertSort(int[] list){
        int n = list.length;
        for (int i =0; i < n;i++){
            int key = list[i];
            int j = i-1;
            while (j>=0 && list[j]>key){
                list[j+1] = list[j];
                j = j -1;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        for (int i:list
             ) {
            System.out.print(i + "\t");

        }
    }
}
