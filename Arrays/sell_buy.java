//pb:121 easy
//buy and sell stock
//we should find the max profit from the day to the ith day like ex[7,1,5,6,4]=6-1 is the profit
//1-7=-6 and -6<0 so profit is not updated
//5-1=4 and 4>0=4 and prices[i] here is 1 where 1<min already existed min=7 so that is updated min=prices[i] or do it in the short way
//like profit will be Math.max(cost,profit)
//and min will be prices[i],min value
//noraml approach
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
