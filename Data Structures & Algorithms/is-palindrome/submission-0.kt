class Solution {
    fun isPalindrome(s: String): Boolean {

        val sList = s.filter{it.isLetterOrDigit()}.lowercase().toList()
        var left = 0
        var right = sList.size-1

        while (left < right){
            if(sList[left] == sList[right]){
                left += 1
                right -=1
            }
            else{
                return false 
            }
            
        }
        return true
    }
}
