
public class CreateArry {

    public static int searchInString(String manu[],String key){
         for(int i=0;i<manu.length;i++){
            if (manu[i]==key) {
                return i;
            }
         }
         return -1;
    }

    public static void main(String[] args) {
        int Number[] = new int[10];
        
        int arrr[] ={1,2,3};

        String manu[]={"samose","chole bhature","chai","coffe","aalu paratha"};
        String key="coffe";
        System.out.println(searchInString(manu, key));
    }
}