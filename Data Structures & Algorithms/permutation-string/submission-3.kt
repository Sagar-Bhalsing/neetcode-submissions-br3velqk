class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val window = s1.length
        var l = 0
        var r = window 
        val premutation = s1.toList().sorted()
        if(window>s2.length) return false
        while(r<=s2.length){
            if(premutation == s2.substring(l,r).toList().sorted()){
                return true 
            }
            l++
            r++
        }
        return false
    }
}
