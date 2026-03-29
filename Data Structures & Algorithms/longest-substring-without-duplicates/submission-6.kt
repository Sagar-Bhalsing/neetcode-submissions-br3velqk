class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        var st = HashSet<Char>()
        var r = 0
        var l = 0
        var m = 0
        while(r<s.length){
            while(st.contains(s[r])){
                st.remove(s[l])
                l++
            }
            st.add(s[r])
            m = max(m,st.size)
            r++
            }
            return m
    }
}
 