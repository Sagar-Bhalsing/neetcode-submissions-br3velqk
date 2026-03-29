class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var diff = IntArray(temperatures.size)
        var stack = ArrayDeque<Int>()
        for(i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[stack.last()]<temperatures[i]){
                diff[stack.last()] = i-stack.last()
                stack.removeLast()
            }
            stack.addLast(i)
        }
        return diff
    }
}
