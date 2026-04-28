class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val sortedNums = nums.toHashSet().toList().sorted()
        var count = 1
        var temp = 1
        if(nums.isEmpty()) return 0
        for (i in 0 until sortedNums.size-1){
            if(sortedNums[i]+1 == sortedNums[i+1]){
                temp += 1
                count = max(temp,count)
            }
            else{
                temp = 1
            }
        }
        return count
    }
}
