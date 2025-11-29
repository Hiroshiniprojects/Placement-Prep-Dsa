class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            if(cost>profit){
                profit=cost;
            }
            //profit=Math.max(cost,profit);
            if(prices[i]<min){
                min=prices[i];
            }
            //min=Math.min(prices[i],min);
        }
        return profit;
    }
}