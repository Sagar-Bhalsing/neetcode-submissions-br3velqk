class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val sorted= nums.sorted()

        val output = mutableListOf<MutableList<Int>>()
        for(i in sorted.indices){
            var left = i+1
            var right = nums.lastIndex

            while(left<right){
                val sum = sorted[i]+sorted[left]+sorted[right]
                val temp = mutableListOf<Int>()
                if(sum == 0){
                    temp.add(sorted[i])
                    temp.add(sorted[left])
                    temp.add(sorted[right])
                    output.add(temp)
                    left += 1
                    right -= 1 
                }
                else if(sum > 0){
                    right -= 1
                }
                else if(sum < 0){
                    left+=1
                }
            }
        }
        return output.toSet().toList()
    }
}
