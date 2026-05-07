class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      
      val map = HashMap<Int,Int>()
      var out = IntArray(2)
      for (i in nums.indices){
        val diff = target - nums[i]
        map[nums[i]] = i+1
        if(map.containsKey(diff)){
            out[0] = map[diff]!!
            out[1] = i+1
        } 
      }
      return out
    }
}