class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int increasing = 1, decreasing = 1;
        int longest = 1;

        for(int i = 1; i < n; i++)
        {
            if(nums[i] > nums[i - 1])
            {
                increasing += 1;
                decreasing = 1;
            }
            else if(nums[i] < nums[i - 1])
            {
                decreasing += 1;
                increasing = 1;
            }
            else
            {
                increasing = 1;
                decreasing = 1;
            }

            longest = Math.max(longest, Math.max(increasing, decreasing));
        }

        return longest;
    }
}