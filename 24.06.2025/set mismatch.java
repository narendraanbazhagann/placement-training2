import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;
            }
            seen.add(num);
            sum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (sum - duplicate);

        return new int[] {duplicate, missing};
    }
}
