class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val Sset = HashSet<Char>()
        var l = 0
        var r = 0
        var longest = 0
        while(r<=s.length-1){
            while(Sset.contains(s[r])){
                Sset.remove(s[l])
                l++
            }
            Sset.add(s[r])
            longest = max(longest,Sset.size)
            r++
        }
        return longest
    }
}
 