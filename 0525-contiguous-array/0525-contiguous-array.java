class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int ones = 0, zeros = 0, maxLen = 0;
        mpp.put(0, -1);

        for(int i = 0; i < n; i++)
        {
            if(nums[i] == 0) zeros++;
            else ones++;

            int diff = zeros - ones;
            if(mpp.containsKey(diff)) maxLen = Math.max(maxLen, i - mpp.get(diff));
            else mpp.put(diff, i);
        }

        return maxLen;
    }
}