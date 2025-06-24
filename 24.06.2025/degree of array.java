
import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        
        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            first.putIfAbsent(num, i); 
            count.put(num, count.getOrDefault(num, 0) + 1);

            if (count.get(num) > degree) {
                degree = count.get(num);
                minLength = i - first.get(num) + 1;
            } else if (count.get(num) == degree) {
                minLength = Math.min(minLength, i - first.get(num) + 1);
            }
        }

        return minLength;
    }
}
