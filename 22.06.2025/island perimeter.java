class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // Check upward neighbor
                    if (i > 0 && grid[i - 1][j] == 1) perimeter--;
                    
                    // Check left neighbor
                    if (j > 0 && grid[i][j - 1] == 1) perimeter--;
                    
                    // Check downward neighbor
                    if (i < rows - 1 && grid[i + 1][j] == 1) perimeter--;
                    
                    // Check right neighbor
                    if (j < cols - 1 && grid[i][j + 1] == 1) perimeter--;
                }
            }
        }

        return perimeter;
    }
}
