class MinStack() {

    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()
    fun push(`val`: Int) {
        stack.addLast(`val`)
        if(minStack.isEmpty() || `val` <= minStack.last()){
        minStack.addLast(`val`)
        }        
    }

    fun pop() {
        if(stack.last() == minStack.last()){
            minStack.removeLast()
        }
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
