public class SudokuSolver {
    public boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] == '.')
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solveSudoku(board)) return true;
                            board[i][j] = '.';
                        }
                        return false;
                    }
        return true;
    }

    private boolean isValid(char[][] b, int r, int c, char val) {
        for (int i = 0; i < 9; i++)
            if (b[i][c] == val || b[r][i] == val || b[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == val)
                return false;
        return true;
    }
}
