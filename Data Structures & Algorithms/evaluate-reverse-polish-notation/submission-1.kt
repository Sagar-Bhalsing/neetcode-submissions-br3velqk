class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var stack = ArrayDeque<Int>()
        val setOperands = hashSetOf("+","-","*","/")
        var x = 0
        var y = 0
        for (i in tokens.indices){
            if(setOperands.contains(tokens[i])){
                x = stack.removeLast()
                y = stack.removeLast()
                stack.addLast(operate(x,tokens[i],y))
            }
            else{
            stack.addLast(tokens[i].toInt())
        }
        }
        return stack.last()

    }

    fun operate(num1: Int, operator: String, num2: Int): Int {
    return when (operator) {
        "+" -> num2 + num1
        "-" -> num2 - num1
        "*" -> num2 * num1
        "/" -> num2 / num1
        else -> throw IllegalArgumentException("Unknown operator: $operator")
    }
}
}
