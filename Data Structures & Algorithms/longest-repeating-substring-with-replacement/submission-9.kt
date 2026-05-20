class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val map = HashMap<Char,Int>()
        var maxCount = 0
        var l = 0 
        var r = 0
        var ans = 0
        while(r<=s.length-1){
            map[s[r]] = map.getOrDefault(s[r],0)+1
            maxCount = max(maxCount,map[s[r]]!!)
            r++
            while((r-l)-maxCount>k){
                map[s[l]] = map.getOrDefault(s[l],0)-1
                l++
            }
            ans = max(ans,r-l)
        }
        return ans
    }
}
