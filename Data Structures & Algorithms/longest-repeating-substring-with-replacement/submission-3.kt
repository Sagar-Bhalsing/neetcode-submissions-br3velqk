class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val map = HashMap<Char,Int>()
        var max = 0
        var output = 0
        var l = 0
        for (i in s.indices){
            map[s[i]] = map.getOrDefault(s[i],0)+1
            max = max(map[s[i]]!!,max)

            while(i-l+1-max>k){
                map[s[l]] = map[s[l]]!!-1
                l++
            }
            output = max(output,i-l+1)
        }
        return output
}
}
