class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        long concatSum = 0;
        while(left < right)
        {
            int a = nums[left];
            int b = nums[right];
            int digit = (int)Math.log10(b) + 1;
            long concatValue = a * (long)Math.pow(10, digit) + b;
            concatSum += concatValue;
            left++;
            right--;
        }

        if(left == right) concatSum += nums[left];
        return concatSum;
    }
}