class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val map = HashSet<Char>()
        var ans = 0
        var l = 0
        var r = 0 
        while(r<=s.length-1){
            while(map.contains(s[r])){
                map.remove(s[l])
                l++
            }
            map.add(s[r])
            r++
            ans = max(r-l,ans)
        }
        return ans
    }
}
 