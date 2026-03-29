class Solution {
    fun longestConsecutive(nums: IntArray): Int {

       val map = nums.toHashSet()

       var ans = 1
       if(nums.isEmpty()) return 0
       for (i in nums){
        if(map.contains(i+1)){
            var curr = i
            var l = 1
            while(map.contains(curr+1)){
                curr += 1
                l += 1
            }
        ans = max(l,ans)
        }
       }
       return ans
    }
}
