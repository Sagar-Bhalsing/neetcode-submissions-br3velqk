class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int,Int>()
        var o = IntArray(2)
        for(i in nums.indices){
            val diff = target - nums[i]
            if(map.containsKey(diff)){
                o[0] = map[diff]!!
                o[1] = i
            }
            map[nums[i]] = i
        }
        return o
}}
