class Solution {
    fun isValid(s: String): Boolean {
        val map =  mapOf('(' to ')', '{' to '}', '[' to ']')
        val stack  = ArrayDeque<Char>()

        for(i in s){
            when{ 
                i == '(' || i == '{' || i == '[' -> {
                    stack.addLast(i)
                }
                else -> {
                    if(stack.isEmpty()) return false 
                    else if(map[stack.last()] == i){
                        stack.removeLast()
                        continue
                    }
                    else {return false }
                }
            }
        }
        return stack.isEmpty()
    }
}
