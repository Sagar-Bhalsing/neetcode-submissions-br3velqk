class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var profit = 0

        for (i in 1 until prices.size){
            val diff = prices[i] - min 
            profit = max(diff,profit)
            min = minOf(min, prices[i])
        }
        return profit
    }
}
