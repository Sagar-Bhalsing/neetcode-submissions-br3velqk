class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val strSet = HashSet<Char>()

        var i = 0
        var j = 0
        var ans = 0
        while (j < s.length) {
            while(strSet.contains(s[j])){
                strSet.remove(s[i])
                i++
            }
            strSet.add(s[j])
            ans = max(ans,j-i+1)
            j++
        }
        return ans
    }
}
