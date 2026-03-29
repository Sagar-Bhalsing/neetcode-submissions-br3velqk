class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val map = HashMap<Int,Int>()
        if(nums.isEmpty()){
            return 0
        }
        for (i in nums){
            map[i] = map.getOrDefault(i,0)+1
        }
        val sortedMap = map.toSortedMap()

        var actualCount = 1
        for ((key,value) in sortedMap){
            var count = 1
            var current = key-1
            while(sortedMap.containsKey(current)){
                count += 1
                current -= 1
            }
            actualCount = max(actualCount,count)
        }
        return actualCount

    }
}
