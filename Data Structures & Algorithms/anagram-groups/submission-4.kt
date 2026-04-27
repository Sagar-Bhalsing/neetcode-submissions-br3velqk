class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = HashMap<String,MutableList<String>>()

        for(i in strs){
            val key = i.toList().sorted().joinToString("")
            if(!map.containsKey(key) || map.isEmpty()){
                val temp = mutableListOf(i)
                map[key] = temp
            }
            else{
            map[key]!!.add(i)
            }
        }
        return map.values.toList()
    }
}
