class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val ans = mutableListOf<List<Int>>()
        val num = nums.sorted()
        for (i in 0 until num.size - 2){
            if(i > 0 && num[i] == num[i-1]) continue 
            var j = i+1
            var k = num.size - 1
            val target = -num[i]
            while(j<k){
            val diff = num[j] + num[k]
            var temp = mutableListOf<Int>()
                when{
                    diff < target -> {
                        j++
                    }
                    diff > target -> {
                        k--
                    }
                    else -> {
                        temp.add(num[i])
                        temp.add(num[j])
                        temp.add(num[k])
                        ans.add(temp)
                        j++
                        k--
                        while(j<k && num[j] == num[j-1]){
                            j++
                        }
                          while(j<k && num[k] == num[k+1]){
                            k--
                        }

                    }
                }
            }
        }
        return ans
    }
}
