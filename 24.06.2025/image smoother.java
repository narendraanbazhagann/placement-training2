class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        
        int[][] result = new int[m][n];

       
        int[] dirs = {-1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                int sum = 0;
                int count = 0;

               
                for (int dx : dirs) {
                    for (int dy : dirs) {
                        int ni = i + dx;
                        int nj = j + dy;

                        
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }

                result[i][j] = sum / count;  
            }
        }

        return result;
    }
}
