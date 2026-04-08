class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = ArrayDeque<Int>()
        val setOperands = hashSetOf("+","-","*","/")
        for(i in tokens){
            if(setOperands.contains(i)){
                val y = stack.removeLast()
                val x = stack.removeLast()
                stack.addLast(operation(x,y,i))
            }
            else{
            stack.add(i.toInt())
            }
        }
        return stack.last().toInt()
    }

    fun operation(x:Int,y:Int,op:String):Int{
        return when(op){
            "+" -> {x+y}
            "-" -> {x-y}
            "*" -> {x*y}
            "/" -> {x/y}
            else -> throw IllegalArgumentException("Unknown operator")
        }
    }
}
