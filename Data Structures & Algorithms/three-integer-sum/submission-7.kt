class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {


        var ans = mutableListOf<MutableList<Int>>()
        val sortedNums = nums.sorted()

        for(i in 0 until sortedNums.size-2){
            if(i>0 && sortedNums[i] == sortedNums[i-1]) continue
            var l = i+1
            var r = sortedNums.size-1
            while(l<r){
                val sum = sortedNums[i]+sortedNums[l]+sortedNums[r]
                if(sum == 0){
                    var temp = mutableListOf<Int>()

                    temp.add(sortedNums[i])
                    temp.add(sortedNums[l])
                    temp.add(sortedNums[r])
                    ans.add(temp)
                    l++
                    r--
                    while(l<r && sortedNums[l] == sortedNums[l-1]) l++
                    while(l<r && sortedNums[r] == sortedNums[r+1]) r--
                }
                else if(sum>0){
                    r--
                }
                else if(sum<0){
                    l++
                }
            }
        }
        return ans
    }
}
