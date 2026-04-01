class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        var ans = IntArray(2)
        for(i in nums.indices){
            map[nums[i]] = i
            val diff = target-nums[i]
            if(map.containsKey(diff)){
                ans[0] = map[diff]!!+1
                ans[1] = i+1
            }
        }
        return ans
    }
}