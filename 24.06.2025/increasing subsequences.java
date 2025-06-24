
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] > nums[i - 1]) {
                count++;
                maxLength = Math.max(maxLength, count);
            } else {
                count = 1;  
            }
        }

        return maxLength;
    }
}
