class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
       var l = 0
       val s1L = s1.toList().sorted()
       val window = s1L.size
       val range = s2.length - window 
       var r = window - 1

       while(r < s2.length){
        var temp = mutableListOf<Char>()
        for(i in l..r){
            temp.add(s2[i])
        }
        if(temp.sorted() == s1L) return true 
        temp.clear()
        l++
        r++
       }
       return false
    }
}
