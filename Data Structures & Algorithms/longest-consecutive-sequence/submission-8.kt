class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val hashSet = nums.toHashSet()
        val sort = nums.sorted()
        var max = 1
        if(nums.isEmpty()) return 0
        for(i in nums){
            var count = 1
            if(hashSet.contains(i)){
                var j = i
                while(hashSet.contains(j+1)){
                    count++
                    j++
                }
            }
            max = max(max,count)
        }
    return max
    }
}
