class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int prefixSum = 0, count = 0;
        Map<Integer, Integer> mpp = new HashMap<>();    //{PrefixSum, count}
        mpp.put(0, 1);      

        for(int i = 0; i < n; i++)
        {
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0) rem += k;
            if(mpp.containsKey(rem)) count += mpp.get(rem);
            mpp.put(rem, mpp.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}