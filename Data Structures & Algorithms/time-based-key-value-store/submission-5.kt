class TimeMap() {

    var map = HashMap<String,MutableList<Pair<Int,String>>>()
    fun set(key: String, value: String, timestamp: Int) {
        if(!map.containsKey(key)){
            map[key] = mutableListOf(Pair(timestamp,value))
        }
        else{
            map[key]?.add(Pair(timestamp,value))
        }
    }

    fun get(key: String, timestamp: Int): String {
        if(!map.containsKey(key)) return ""
        val valueList = map[key] !!
        var l = 0
        var r = valueList.size - 1
        var result = -1
        while(l<=r){
            val mid = l+(r-l)/2
            when{
            valueList[mid].first <= timestamp -> {
                result = mid 
                l = mid + 1
            }
            else -> {
                r = mid - 1
            }
          }
        }
        return if(result == -1) "" else valueList[result].second
    } 
}
