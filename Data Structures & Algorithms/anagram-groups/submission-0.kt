class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = HashMap<String, MutableList<String>>()

        for( i in strs.indices){
            val sorted = strs[i].toCharArray().sorted().joinToString("")

            if(map.containsKey(sorted)){
                map[sorted]!!.add(strs[i])
            }
            else{
                val list = mutableListOf<String>()
                list.add(strs[i])
                map[sorted] = list
            }
        }
        return map.values.toList()

    }
}
