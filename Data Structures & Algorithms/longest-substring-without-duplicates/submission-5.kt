class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val hashSet = HashSet<Char>()

        var output = 0
        var l = 0

        for(i in s.indices){
            while(hashSet.contains(s[i])){
                hashSet.remove(s[l])
                l++
            }
            hashSet.add(s[i])
            output = max(output,hashSet.size)
        }
        return output
    }
}
 