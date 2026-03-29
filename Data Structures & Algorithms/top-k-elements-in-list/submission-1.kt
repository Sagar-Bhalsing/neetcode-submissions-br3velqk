class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val map = HashMap<Int,Int>()
        val output = mutableListOf<Int>()
        for (i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }
        return map.entries
        .sortedByDescending{
            it.value
        }
        .take(k)
        .map{it.key}
        .toIntArray()
    }
}
