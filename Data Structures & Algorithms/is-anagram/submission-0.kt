class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val map = HashMap<Char,Int>()

if(s.length != t.length){
    return false
}
        for(char in s){
             map[char] = map.getOrDefault(char,0)+1
        }

        for(i in t){
            if(map.containsKey(i)){
                map[i] = map[i]!!-1
                if(map[i]!!<0){
                return false 
            }
            }
            else{
                return false
            }
            }
            return true 

    }
}
