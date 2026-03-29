class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

    val map = HashSet<Char>()
    var o = 0
    var l = 0

    for(i in s.indices){

        while(map.contains(s[i])){
            map.remove(s[l])
            l++
        }
        map.add(s[i])
        o = max(o,i-l+1)
    }
    return o
    }
}
 