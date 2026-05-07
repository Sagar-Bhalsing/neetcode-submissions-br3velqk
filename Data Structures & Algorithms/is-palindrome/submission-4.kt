class Solution {
    fun isPalindrome(s: String): Boolean {
        val flat = s.lowercase().filter{
            it.isLetterOrDigit()
        }
        return flat == flat.reversed()
    }
}
