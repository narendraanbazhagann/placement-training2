
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;         // number of rows
        int n = mat[0].length;      // number of columns

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;  // Return original if total elements mismatch
        }

        int[][] result = new int[r][c];

        // Flatten and refill
        for (int i = 0; i < m * n; i++) {
            // original row = i / n, original col = i % n
            // new row = i / c, new col = i % c
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }
}
