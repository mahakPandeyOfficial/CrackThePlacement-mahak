//By Using DP

/*class Solution {
    public int maxProfit(int[] prices) {
        //it is not possible to sell the stock on first day
        int buy = -Integer.MAX_VALUE;
        int sell = 0;

        for(int stockPrice : prices){
            int prevBuy = buy, prevSell = sell;

            //either not hold or buy
            buy = Math.max(prevBuy, prevSell - stockPrice);
            sell = Math.max(prevSell, prevBuy + stockPrice);
        }

        return sell;
    }
}
*/

//By Using Greedy
class Solution{
   public int maxProfit(int [] prices){
       int totalProfit = 0;
        for(int i = 0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                totalProfit += (prices[i+1] - prices[i]);
            }
        }
        return totalProfit;
   }
}
