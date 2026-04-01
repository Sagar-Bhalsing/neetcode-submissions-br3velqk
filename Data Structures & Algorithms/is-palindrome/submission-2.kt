class Solution {
    fun isPalindrome(s: String): Boolean {

        val sl = s.filter{it.isLetterOrDigit()}.lowercase().toCharArray().joinToString(" ")
        if(sl.reversed() == sl) return true
        return false
    }
}
