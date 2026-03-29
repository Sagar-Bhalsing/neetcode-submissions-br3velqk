class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var l = 0
        var map = HashMap<Char,Int>()
        var max = 0
        var window = 0
        var output = 0
        
        for(i in s.indices){
            map[s[i]]=map.getOrDefault(s[i],0)+1
            max = max(map[s[i]]!!,max)
            window = i - l + 1
            while(window-max>k){
                map[s[l]] = map[s[l]]!!-1
                l += 1
                window = i - l + 1
            }
            output = max(window,output)
        }
        return output 
    }
}
