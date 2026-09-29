class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        // We will make a hashSet with will store unique value when we iterate through the sudko like for row we will keep like 
        //actualNumber in row rowNumber
        //actualNumber in col rowNumber
        //actualNumber in box boxNumber


        val parentHashSet = HashSet<String>()

        for(i in 0 until 9){
            for (j in 0 until 9){
                val num = board[i][j]
                if(num != '.'){
                    if (!parentHashSet.add("$num in row $i")||
                    !parentHashSet.add("$num in col $j")||
                    !parentHashSet.add("$num in box ${i/3}-${j/3}")
                    ) return false
                }
      
            }
        }
        return true

    }
}
