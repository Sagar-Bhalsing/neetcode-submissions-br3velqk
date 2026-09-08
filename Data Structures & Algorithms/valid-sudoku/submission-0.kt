class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        //hashSetOf("1","2","3","4","5","6","7","8","9")
        val sudokuHashSetRow = List(9){HashSet<Char>()}
        val sudokuHashSetCol = List(9){HashSet<Char>()}
        val sudokuHashSetBox = List(9){List(9){HashSet<Char>()}}
        for(i in 0..8){
            for(j in 0..8){
                val value = board[i][j]
                if(value != '.'){
                    if(sudokuHashSetRow[i].contains(value)){
                        return false 
                    }
                     if(sudokuHashSetCol[j].contains(value)){
                        return false 
                    }
                    val boxi = i/3
                    val boxj = j/3
                    if(sudokuHashSetBox[boxi][boxj].contains(value)){
                        return false 
                    }
                    sudokuHashSetRow[i].add(value)
                    sudokuHashSetCol[j].add(value)
                    sudokuHashSetBox[boxi][boxj].add(value)
                }
                else continue
            }
        }
        return true
    }
}