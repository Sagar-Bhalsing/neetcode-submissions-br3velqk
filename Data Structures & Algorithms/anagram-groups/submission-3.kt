class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

       val map = HashMap<String,MutableList<String>>()

       for(i in strs){
        val key = i.toCharArray().sorted().joinToString("")
       if(map.containsKey(key)){
        map[key]!!.add(i)
       }
       else{
        val temp = mutableListOf<String>()
        temp.add(i)
        map[key] = temp
       }
       }
       return map.values.toList()
    }
}
