class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int [2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            int required = target - nums[i];
            if(mp.containsKey(required))
            {
                arr[0] = mp.get(required);
                arr[1] = i;
                return arr;
            }
            mp.put(nums[i],i);
        }
        return arr;
    }
}