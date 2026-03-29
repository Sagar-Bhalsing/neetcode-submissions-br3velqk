class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int,Int>()
        val o = IntArray(2)
        for(i in nums.indices){
            if(map.containsKey(target - nums[i])){
                o[0] = map[target-nums[i]]!!
                o[1] = i
            }
            map[nums[i]] = i
        }
        return o
        
}}
