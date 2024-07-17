class Solution {
    public int maxProfit(int[] prices) {
        int leastProfit = Integer.MAX_VALUE;
        int totalProfit = 0;
        int soldToday = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < leastProfit){
                leastProfit = prices[i];
            }
            soldToday = prices[i] - leastProfit;
            if(totalProfit < soldToday){
                totalProfit = soldToday;
            }
        }
        return totalProfit;
    }
}
