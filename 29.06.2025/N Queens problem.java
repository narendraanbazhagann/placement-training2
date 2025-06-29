public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(board, 0, res);
        return res;
    }

    void backtrack(char[][] board, int row, List<List<String>> res) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (char[] r : board) list.add(new String(r));
            res.add(list);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(board, row + 1, res);
                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(char[][] b, int r, int c) {
        for (int i = 0; i < r; i++) if (b[i][c] == 'Q') return false;
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) if (b[i][j] == 'Q') return false;
        for (int i = r - 1, j = c + 1; i >= 0 && j < b.length; i--, j++) if (b[i][j] == 'Q') return false;
        return true;
    }
}
