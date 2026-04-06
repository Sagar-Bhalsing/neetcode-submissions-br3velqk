class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Sort =  s1.toList().sorted()
        val window = s1.length-1
        var l = 0
        var r = window
        while(r<=s2.length-1){
            if(s1Sort == s2.substring(l..r).toList().sorted()){
                return true 
            }
            l++
            r++
        }
        return false        
    }
}
