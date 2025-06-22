import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Use TreeSet to store top 3 distinct values in descending order
        TreeSet<Integer> maxSet = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            maxSet.add(num);
            if (maxSet.size() > 3) {
                maxSet.pollLast(); // Remove the smallest among top 4
            }
        }

        // If we have at least 3 distinct max values
        if (maxSet.size() == 3) {
            return maxSet.last(); // third max
        }

        // Otherwise, return the maximum
        return maxSet.first();
    }
}
