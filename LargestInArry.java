import java.util.*;

public class LargestInArry {
    // // public static  int[] creatingArry(){
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[5];
    //     for (int i = 0; i < arr.length; i++) {
    //         int temp=sc.nextInt();
    //         arr[i]=temp;
    //     }
    //     return  arr;
    // }

    public static int findLargestNumber(int arr[]){
        
        int min = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]>min) {
                min =arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
       int arr[] = {20,12,40,54,10,81,32,41};
       System.out.println("Largest number in Arry = " +findLargestNumber(arr));
        
    }
}
