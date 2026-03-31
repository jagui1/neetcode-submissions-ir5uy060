class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[low]){
                low = i;
            } else {
                if(prices[i] - prices[low] > profit){
                    profit = prices[i] - prices[low];
                }
            }
        }

        return profit;
    }
}
