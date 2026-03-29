class Solution {
    fun maxArea(heights: IntArray): Int {

        var max = Int.MIN_VALUE

        var l = 0
        var r = heights.size-1

        while(l<r){
            if(heights[l]>heights[r]){
                max = max(max,heights[r] * (r-l))
                r -= 1
            }
            else{
                max = max(max,heights[l] * (r-l))
                l+=1
            }
        }
        return max

    }
   
}
