class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var ans = IntArray(nums.size)
        var l = 1
        var r = 1
        for (i in nums.indices){
            ans[i] = l
            l *= nums[i]
        }
        for (j in nums.size - 1 downTo 0){
            ans[j] *= r
            r *= nums[j]
        }
        return ans
    }
}

