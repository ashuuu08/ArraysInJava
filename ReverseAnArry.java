import java.util.*;
class Solution {
    public void convertDateToBinary(String date) {

       String parts[] = date.split("-") ;

       String year = parts[0];
       String mm = parts[1];
       String dd = parts[2];

       int yyyyInt= Integer.parseInt(year);
       int mmInt = Integer.parseInt(mm);
       int ddInt = Integer.parseInt(dd);


       String binaryIntYYYY = Integer.toBinaryString(yyyyInt);
       String binaryIntMM = Integer.toBinaryString(mmInt);
       String binaryIntDD = Integer.toBinaryString(ddInt);


       System.out.println(binaryIntYYYY+"-"+binaryIntMM+"-"+binaryIntDD);
       
    }
    
    
    public  void main(String args[]){
        convertDateToBinary("2080-10-03");
}

    }