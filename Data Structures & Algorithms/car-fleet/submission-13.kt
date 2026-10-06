class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val queue =ArrayDeque<Int>()
        val map = HashMap<Int,Double>()
        val sortPosition = position.sorted()

        var count = 0
        for(i in position.indices){
            val diff = target - position[i]
            val dist = diff.toDouble()/speed[i]
            map[position[i]] = dist
        }
      
        for(i in position.size-1 downTo 0){
            queue.addLast(sortPosition[i])
        }
        
        //[3,4.5,10,3]
       var previousTime = 0.0
        for (i in 0 until position.size){
            val top = queue.pop()
            var currentTime = map[top]!!  
            if(currentTime>previousTime){
                count += 1
                previousTime=currentTime
            }
        }
        return if(position.size == 1) 1 else count

    }
}
