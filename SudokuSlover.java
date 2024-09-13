public class SudokuSlover {
    public static boolean isSafe(char[][] board, int row, int col, int num){
        // row and colunm
        for(int i=0; i<board.length; i++){
            if (board[i][col] == (char)(num + '0')) {
                return false;
            }
            if (board[row][i] == (char)(num + '0')) {
                return false;
            }
        }

        // grid
        int sRow = (row/3) * 3;
        int sCol = (col/3) * 3;
        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if (board[i][j] == (char)(num + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helper(char[][] board, int row, int col){
        if (row == board.length) {
            return true; 
        }
        int newR = 0;
        int newC = 0;
        if (col != board.length-1) {
            newR = row;
            newC = col + 1;
        }
        else{
            newR = row + 1;
            newC = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, newR, newC)) {
                return true;
            }
        }
        else{
            for(int i=1; i<=9; i++){
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');
                    if (helper(board, newR, newC)) {
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static void sudoku(char[][] board){
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        
    }
}
