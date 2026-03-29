class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var profit = 0
        var min = prices[0]

        for(i in 1 until prices.size){
            profit = max(prices[i]-min,profit)
            if(prices[i]<min){
                min = prices[i]
            }
        }
        return profit
    }
}
