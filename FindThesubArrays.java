public class FindThesubArrays {
    public static void findSubArrays(int arr[]){
        int tsa=0;
        int sumarr[] = new int[arr.length];
        int x=0;
        for (int k = 0; k < arr.length; k++) {
            int ts=0;
            for(int i=k+1;i<arr.length;i++){
                for(int j=k;j<=i;j++){
                    System.out.print(arr[j]+",");
                    ts+=arr[j];
                    
                    tsa++;
                }
    
                System.out.println();
    
            }
           
            System.out.println("sum of sub arrys :) "+ts);
            
            
                sumarr[x]=ts;        
            x++;    
            System.out.println();
        }
        for(int i=0; i<sumarr.length;i++){
            System.out.print(sumarr[i]+" ");
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<sumarr.length;i++){
            if(sumarr[i]>min){
                min=sumarr[i];
            }
            if(sumarr[i]<max){
                max=sumarr[i];
            }

           
        }
        System.out.println();
        System.out.println("Minimun sun of sub Arrays :) "+max+" || AND Maximumm sum of sb arrays :) "+min);

        System.out.println();

            System.out.println("total Number of sub Arrays :) "+tsa);


        }
    public static void main(String args[]){
        int arr[] ={2,-4,-6,8,-10};
        findSubArrays(arr);
    }
}
