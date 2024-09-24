
public class MaxSumOFSubarraysUSingPrifix {
    public static void maxSumOfArrays(int arr[]){
     int prifix[] = new int[arr.length];
     int min = Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        int ts=0;
        for(int j=i+1; j< arr.length;j++){
           for(int k=i;k<j;k++){
           ts+=arr[k];
           }
        }
        System.out.print(prifix[i]=ts);
        System.out.println();
        if()
     }
    }

    public static void main (String args[]){
        int arr[] = {3,4,5,6,7,8};

        maxSumOfArrays(arr);
    }
}