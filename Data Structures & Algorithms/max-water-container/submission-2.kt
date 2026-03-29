class Solution {
    fun maxArea(heights: IntArray): Int {

        var l = 0
        var r = heights.size - 1
        var max = Int.MIN_VALUE
        while(l<r){
            val diff =r-l
            if(heights[l] > heights[r]){
                max = max(heights[r] * diff,max)
                r--
            }
            else{
                max = max(heights[l] * diff,max)
                l++
            }
        }
        return max
    }
   
}
