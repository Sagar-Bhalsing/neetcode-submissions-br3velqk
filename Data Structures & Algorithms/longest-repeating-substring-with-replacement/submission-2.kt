class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val map = HashMap<Char,Int>()

        var l = 0
        var max = 0
        var o = 0
        for(r in s.indices){
           map[s[r]] = map.getOrDefault(s[r],0)+1
           max = max(max,map[s[r]]!!)
            while(r-l+1-max > k){
                map[s[l]] = map[s[l]]!!-1
                l++
            }
            o = max(o,r-l+1)
 

        }
        return o
    }
}
