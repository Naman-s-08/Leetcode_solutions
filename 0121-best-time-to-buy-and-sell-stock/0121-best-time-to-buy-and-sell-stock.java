class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            int curProfit=prices[i]-buyPrice;
            if(curProfit>maxProfit){
                maxProfit=curProfit;
            }
            if(buyPrice>prices[i]){
                buyPrice=prices[i];
            }

        }
        return maxProfit;
        
    }
}