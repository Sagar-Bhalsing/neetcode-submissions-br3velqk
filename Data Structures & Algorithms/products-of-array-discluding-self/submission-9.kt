class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val numSize = nums.size
        val ans = IntArray(numSize)
        var left = 1
        var right = 1

        for(i in nums.indices){
            ans[i] = left
            left *= nums[i]
        }

        for (i in numSize-1 downTo 0){
            ans[i] *= right
            right *= nums[i]
        }
        return ans

    }
}
