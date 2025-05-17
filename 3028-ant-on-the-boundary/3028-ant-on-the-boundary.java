class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0, steps = 0;
        for(int i = 0; i < nums.length; i++)
        {
            steps += nums[i];
            if(steps == 0) count += 1;
        }

        return count;
    }
}