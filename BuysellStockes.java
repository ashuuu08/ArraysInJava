public class BuysellStockes {
    public static int buySellStocks(int stockPrice[]){
      int minBuyPrice = Integer.MAX_VALUE;
      int profit=0;
      int maxProfit=Integer.MIN_VALUE;
     for(int i=0;i<stockPrice.length-1;i++){
      if (minBuyPrice<stockPrice[i]) {
        minBuyPrice = stockPrice[i];
      }
      profit=stockPrice[i+1]-minBuyPrice;
      if (profit>maxProfit) {
        maxProfit=profit;
      }
     }
     if (maxProfit<0) {
        return 0;
     }
     return maxProfit;
   }
    public static void main(String args[]){
    int stockPrice[] = {7,1,5,3,6,4};
    System.out.println(buySellStocks(stockPrice));
    }
}
