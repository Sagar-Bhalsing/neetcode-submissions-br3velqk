class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = HashMap<String,MutableList<String>>()

        for (i in strs){
            val sort = i.toCharArray().sorted().joinToString("")
            if(map.containsKey(sort)){
            map[sort]!!.add(i)
            }
            else{
                val temp = mutableListOf<String>()
                temp.add(i)
                map[sort] = temp
            }
        }
        return map.values.toList()
    }
}
