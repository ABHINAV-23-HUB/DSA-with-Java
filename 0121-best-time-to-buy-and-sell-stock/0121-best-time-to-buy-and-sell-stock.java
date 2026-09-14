class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int profit;
        int maxprofit=0;
        for(int i=1;i<prices.length; i++){
            //here find cheapest price
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            //profit on selling stock
            profit=prices[i]-minprice;
            //maxprice
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    } 
}