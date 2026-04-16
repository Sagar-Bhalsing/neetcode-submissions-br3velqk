class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

       
        val max = piles.max()
        var l = 1
        var r = max
        while(l<r){
            val mid = l+(r-l)/2
            val hours = calculateHours(piles,mid)
            when{
                hours <= h ->{
                    r = mid
                }
                else -> {
                    l = mid+1
                }
            }
        }
        return l
        
    }

    fun calculateHours(piles:IntArray,k:Int):Int{
        var hours = 0
        for (i in piles){
            hours += (i+k-1)/k
        }
        return hours
    }
}
