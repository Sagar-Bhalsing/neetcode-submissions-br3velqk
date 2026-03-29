class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val output = mutableListOf<Int>()
        val numMap = HashMap<Int,Int>()

        for(i in nums.indices){
            val diff = target-nums[i]
            if(numMap.containsKey(diff)){
                output.add(numMap[diff]!!)
                output.add(i)
                break
            }
            numMap[nums[i]] = i

        }
        return output.toIntArray()
        
}}
