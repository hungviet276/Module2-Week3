public class BinarySearch {
    public static int[] list ={0,1,2,3,4,5,6,7,8,9,10,11,12};
    public static int binarySearch(int[] arr,int left,int right,int number){
        if (right>= left){
            int mid = left +(right-left)/2;
            if (arr[mid]==number){
                return mid;
            } else if (arr[mid]> number){
                return binarySearch(arr,left,mid-1,number);
            }else return binarySearch(arr,mid+1,right,number);

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,0,12,10));
    }
}
