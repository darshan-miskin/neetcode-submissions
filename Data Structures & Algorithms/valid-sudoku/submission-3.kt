class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val t2 = Array<IntArray>(10){ IntArray(10){0} }
        
        for(i in 0..board.lastIndex){
            val row = IntArray(10){0}
            val col = IntArray(10){0}
            for(j in 0..board[i].lastIndex){
                if(board[i][j]!='.'){
                    val digit = board[i][j].digitToInt()
                    row[digit]++
                    if(row[digit]>1) return false

                    val box:Int = (i/3)*3 + (j/3)
                    t2[box][digit]++
                    if(t2[box][digit]>1) return false

                }
                if(board[j][i]!='.'){
                    val digit = board[j][i].digitToInt()
                    col[digit]++
                    if(col[digit]>1) return false
                }
            }
        }
        return true
    }
}
