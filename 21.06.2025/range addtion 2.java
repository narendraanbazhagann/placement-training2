class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // Initialize minA and minB to full matrix size
        int minA = m;
        int minB = n;

        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        return minA * minB;
    }
}
