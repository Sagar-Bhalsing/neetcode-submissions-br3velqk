class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var maxP = 0
        var min = prices[0]

        for(i in 1 until prices.size){
            if(prices[i]<min){
                min = prices[i]
            }
            maxP = max(maxP,prices[i]-min)
        }
        return maxP
    }
}
