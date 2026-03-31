class Solution {

    fun encode(strs: List<String>): String {
        var encodedString = ""
        for ( i in strs){
            encodedString += "${i.length}#$i"
            }
        return encodedString
    }

    fun decode(str: String): List<String> {
        var outputList = mutableListOf<String>()
        var i = 0
        while(i<str.length){
            var j = i
            while(str[j]!='#'){
                j++
            }
            val len = str.substring(i,j).toInt()
            outputList.add(str.substring(j+1,j+1+len))
            i = j+1+len
        }
        return outputList.toList()
    }
}
