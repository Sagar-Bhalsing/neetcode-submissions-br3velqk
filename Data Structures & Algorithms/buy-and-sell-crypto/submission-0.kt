class Solution {
    fun maxProfit(prices: IntArray): Int {

        var maxProfit = 0
        for ( i in prices.indices){
        var pointer = i+1

        while(pointer < prices.lastIndex+1){
            var temp =  prices[pointer] - prices[i]
            if( temp > 0){
                maxProfit = max(maxProfit,temp)
                pointer += 1
            }
            else{
                 maxProfit = max(maxProfit,0)
                 pointer +=1
            }
        }
        }
        return maxProfit
    }
}
