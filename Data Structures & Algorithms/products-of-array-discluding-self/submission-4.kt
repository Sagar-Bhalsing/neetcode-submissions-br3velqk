class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        var left = 1
        var right = 1
        for (i in nums.indices){
            ans[i] = left
            left *= nums[i]
        }
        for (i in nums.lastIndex downTo 0){
            ans[i] *= right
            right *= nums[i]
        }
        return ans
        }
}

