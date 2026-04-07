class MinStack() {
    val stack  = ArrayDeque<Int>()
    val min = ArrayDeque<Int>()
    fun push(`val`: Int) {
        stack.addLast(`val`)
        if(min.isEmpty() || min.last()>=`val`){
            min.addLast(`val`)
        }
    }

    fun pop() {
        if(stack.last() == min.last()){
            min.removeLast()
        }
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return min.last()
    }
}
