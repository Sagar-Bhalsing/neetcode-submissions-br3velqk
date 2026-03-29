class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        val key = s1.toCharArray().sorted()
        val window = key.size
        var L = 0
        var R = window-1
        var temp = mutableListOf<Char>()

        while(R < s2.length){
            for (i in L..R){
                temp.add(s2[i])
            }
            if(temp.sorted() == key){
                return true 
            }
            temp.clear()
            L += 1
            R += 1
        }
        return false
    }
}
