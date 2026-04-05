class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val map = HashMap<Char,Int>()
        var ans = 0
        var l = 0
        var r = 0
        var maxCount = 0

        while(r<=s.length-1){
            map[s[r]] = map.getOrDefault(s[r],0)+1
            maxCount = max(maxCount,map[s[r]]!!)
            while(r-l+1-maxCount > k){
                map[s[l]] = map[s[l]]!!-1
                l++
            }
            ans = max(ans,r-l+1)
            r++
            
        }
        return ans
}
}
