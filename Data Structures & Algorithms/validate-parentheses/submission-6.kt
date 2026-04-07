class Solution {
    fun isValid(s: String): Boolean {
       
       val map = mapOf('(' to ')','{' to '}','[' to ']')
       var stack = ArrayDeque<Char>()
       
       for(i in s){
           if(map.containsKey(i)){
                stack.addLast(i)
            }
            else if(map.containsValue(i)){
                if(stack.isEmpty()) return false 
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