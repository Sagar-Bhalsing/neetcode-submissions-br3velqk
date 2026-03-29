class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

       val map = HashMap<Int,Int>()

       for (i in nums.indices){
        map[nums[i]] = i
       }

       for(i in nums.indices){
        val diff = target - nums[i] 
        if(map.containsKey(diff) && i < map[diff]!!){
            return intArrayOf(i+1,map[diff]!!+1)
        }
       }
       return intArrayOf()
    }
}