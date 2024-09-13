import java.util.*;
public class ReverseAnArry {

    public static void reverseArry(int arr[]){
        int n = arr.length;
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14,16,18,20};
         reverseArry(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
