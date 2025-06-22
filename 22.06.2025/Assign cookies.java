
import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort greed factors
        Arrays.sort(s); // Sort cookie sizes

        int child = 0, cookie = 0;

        // Assign cookies until either we run out of children or cookies
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++; // Cookie satisfies the child's greed
            }
            cookie++; // Move to the next cookie regardless
        }

        return child; // Number of content children
    }
}
