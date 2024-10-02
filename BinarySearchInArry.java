
public class BinarySearchInArry {

    public static int binarySearch(int number[],int key){
        int start = 0;
        int end = number.length;

        while(start<=end){
            int mid = (start+end)/2;
            if (number[mid]==key){
                return mid;
            } 
            else if (number[mid]<key) {
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int key =60;
       System.out.println( "Value is in " + binarySearch(number, key)+"th index");
    }
}