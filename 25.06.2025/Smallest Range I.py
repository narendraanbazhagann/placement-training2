0class Solution(object):
    def smallestRangeI(self, nums, k):
        mini = min(nums)
        maxi = max(nums)

        if maxi - mini - 2 * k <= 0:
            return 0
        else:
            return (maxi - mini - 2*k)
