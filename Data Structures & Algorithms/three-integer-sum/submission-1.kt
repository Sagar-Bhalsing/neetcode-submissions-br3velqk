class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val sortedNums = nums.sorted()
        var output = mutableListOf<MutableList<Int>>()

        for(i in sortedNums.indices){

            var left = i+1
            var right = sortedNums.lastIndex
            while (left<right){
                var sum = sortedNums[i] + sortedNums[left] +sortedNums[right]
                var temp = mutableListOf<Int>()
                if(sum == 0){
                    temp.add(sortedNums[i])
                    temp.add(sortedNums[left])
                    temp.add(sortedNums[right])
                    output.add(temp)
                    left += 1
                    right -= 1
                }
                else if (sum > 0){
                    right -= 1
                }
                else if (sum < 0){
                    left += 1
                }
            }
        }
        return output.toSet().toList()
    }
}
