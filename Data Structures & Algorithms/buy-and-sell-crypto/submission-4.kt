class Solution {
    fun maxProfit(prices: IntArray): Int {

        var buy = prices[0]
        var ans = 0
        for(i in prices.indices){
            if(prices[i]<buy){
                buy = prices[i]
            }
            ans = max(ans,prices[i]-buy)
        }
        return ans
    }
}
