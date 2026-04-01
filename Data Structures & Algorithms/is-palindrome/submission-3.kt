class Solution {
    fun isPalindrome(s: String): Boolean {
        val clean = s.filter{it.isLetterOrDigit()}.lowercase()
        return clean == clean.reversed()
    }
}
