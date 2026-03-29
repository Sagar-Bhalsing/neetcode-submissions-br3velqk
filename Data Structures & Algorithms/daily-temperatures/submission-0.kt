class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var stack = ArrayDeque<Int>()
        var output = IntArray(temperatures.size)
        for (i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]){
                val index = stack.removeLast()
                output[index] = i-index
            }
            stack.addLast(i)
        }
        return output
    }
}
