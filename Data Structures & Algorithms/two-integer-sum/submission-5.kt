class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int,Int>()
        val o = mutableListOf<Int>()
        for(i in nums.indices){
            if(map.containsKey(target - nums[i])){
                o.add(map[target - nums[i]]!!)
               o.add(i)
            }
            map[nums[i]] = i
        }
        return o.toIntArray()
        
}}
