class Solution {
    fun isValid(s: String): Boolean {
        
        val map = mapOf('(' to ')','{' to '}','[' to ']')

        var q = ArrayDeque<Char>()

        for(i in s.indices){
            if(map.containsKey(s[i])){
                q.addLast(s[i])
            }
            else if(map.containsValue(s[i])){
                if(q.isEmpty()) return false
                else if(s[i] == map[q.last()]){
                    q.removeLast()
                }
                else{
                    return false 
                }
            }
        }
        return q.isEmpty() 
    }
}
