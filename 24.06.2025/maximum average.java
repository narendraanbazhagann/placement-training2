
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;

       
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double sum = maxSum;

       
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
