class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){return false}

        var smap = HashMap<Char,Int>()
        var tmap = HashMap<Char,Int>()

        for (i in s.indices){
            smap[s[i]] = smap.getOrDefault(s[i],0)+1
            tmap[t[i]] = tmap.getOrDefault(t[i],0)+1
        }    
        return smap == tmap
    }
}
