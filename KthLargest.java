public class KthLargest {

    public int ktkhLargest(int[] arr){
      int idx=0;
      int count=0;
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
         if (largest<arr[i]) {
            largest=arr[i];
            idx=i;
         }
      }
      System.out.println(largest);
      return idx;
    }
    public void main(String[] args) {
        int arr[] ={3,78,65,0,54,3,65};
        System.out.println(ktkhLargest(arr));
    }
}
