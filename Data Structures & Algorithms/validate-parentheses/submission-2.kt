class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val sList = s.toList()
        val map = mapOf('(' to ')','{' to '}','[' to ']')
        for (i in sList.indices){
            if(map.containsKey(sList[i])){
                stack.add(sList[i])
            }
            if(map.containsValue(sList[i])){
                if (stack.isEmpty()) return false
                else if(map[stack.last()] == sList[i]){
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
