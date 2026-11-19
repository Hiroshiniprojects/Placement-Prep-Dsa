class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxprice=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                int profit=prices[i]-buy;
                maxprice=Math.max(profit,maxprice);
            }
            buy=Math.min(buy,prices[i]);
        }
        return maxprice;
    }
}