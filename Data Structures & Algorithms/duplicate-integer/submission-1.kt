class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numSet = HashSet<Int>()
        for (i in nums){
            numSet.add(i)
        }
        return nums.size != numSet.size
    }
}
