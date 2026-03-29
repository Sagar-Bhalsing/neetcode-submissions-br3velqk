class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val sList = s.toList()
        val map = mapOf('(' to ')','{' to '}','[' to ']')
        for (i in s ){
            if(map.containsKey(i)){
                stack.add(i)
            }
            if(map.containsValue(i)){
                if (stack.isEmpty()) return false
                else if(map[stack.last()] == i){
                    stack.removeLast()
                }
                else{
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}
