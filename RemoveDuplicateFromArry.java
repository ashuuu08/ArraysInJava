public class RemoveDuplicateFromArry {

    public static int removeDuplicate( int arr[]){
        int count=0;
        int narr[] = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){ 
                continue;
            } else if(arr[arr.length-2]==arr[arr.length-1]){
                count++;
                break;
            }
            
            else{
                narr[count]=arr[i];
                count++;
            }
            
        }
        for (int i = 0; i < narr.length; i++) {
            System.out.print(narr[i]+ " ");
        }
        System.out.println("");
        return count;
    }

    public static void main(String args[]){
        int arr[]= {0,1,1,1,1,2,2,3,3,3};

         System.out.println(removeDuplicate(arr));
    }
}