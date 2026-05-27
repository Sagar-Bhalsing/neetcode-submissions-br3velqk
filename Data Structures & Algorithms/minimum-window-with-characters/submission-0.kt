class Solution {
    fun minWindow(s: String, t: String): String {

        val minWindow = t.length
        var l = 0
        var r = 0

        val tMap = HashMap<Char,Int>()
        val sMap = HashMap<Char,Int>()

       
        var formed = 0
        var ans = ""

        for(i in t){
            tMap[i] = tMap.getOrDefault(i,0)+1
        }
        val required = tMap.size

        while(r<=s.length-1){
            val ch = s[r]
            sMap[ch] = sMap.getOrDefault(ch,0)+1
            if(tMap.containsKey(ch) && tMap[ch] == sMap[ch]){
                formed++
            }
            while(formed == required){
                val sSub = s.substring(l,r+1)
                ans = if(ans.isEmpty() || sSub.length < ans.length){sSub}else ans
                val lChar = s[l]
                sMap[lChar] = sMap[lChar]!! - 1 
                if(tMap.containsKey(lChar) && sMap[lChar]!!<tMap[lChar]!!){
                    formed--
                }
                l++
            }
            r++
        }
        return ans

    }
}
