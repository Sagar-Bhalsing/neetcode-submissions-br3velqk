class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val hashSet = HashSet<Char>()
        var count = 0
        val sList = s.toList()
        var L = 0

        for (i in sList.indices){
            if(hashSet.contains(sList[i])){
                while(hashSet.contains(sList[i])){
                    hashSet.remove(sList[L])
                    L += 1
                }
            }
            hashSet.add(sList[i])
            count = max(count,hashSet.size)

        }
        return count
    }
}
 