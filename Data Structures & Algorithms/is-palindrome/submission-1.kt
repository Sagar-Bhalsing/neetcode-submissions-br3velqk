class Solution {
    fun isPalindrome(s: String): Boolean {

        val sl = s.filter{it.isLetterOrDigit()}.lowercase().toList()
        var l = 0
        var r = sl.size -1

        while(l<r){
            if(sl[l]!=sl[r]) return false 
            l++
            r--
        }
        return true
    }
}
