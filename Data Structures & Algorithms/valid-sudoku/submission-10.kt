class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val boxes = IntArray(9)
        
        for(i in 0..board.lastIndex){
            var row = 0
            var col = 0
            for(j in 0..board[i].lastIndex){
                val digit = board[i][j]
                if (digit != '.'){
                    val maskRow = 1 shl (digit.code - '0'.code)
                    if (row and maskRow != 0) return false

                    val box = (i / 3) * 3 + (j / 3)
                    if (boxes[box] and maskRow != 0) return false
                    
                    row = row or maskRow
                    boxes[box] = boxes[box] or maskRow
                }

                val digitC = board[j][i]
                if (digitC != '.') {
                    val maskCol = 1 shl (digitC.code - '0'.code)
                    if (col and maskCol != 0) return false
                    col = col or maskCol
                }
            }
        }
        return true
    }
}
