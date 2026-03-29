class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size-1
        var max = 0
        while(left<right){
            val diff = right - left
            if(heights[left]>heights[right]){
                max = max(max,heights[right]*diff)
                right -= 1
            }
            else{
                max = max(max,heights[left]*diff)
                left += 1
            }
        }
        return max
    }
   
}
