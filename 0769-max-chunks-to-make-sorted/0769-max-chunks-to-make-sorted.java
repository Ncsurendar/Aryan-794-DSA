class Solution {
    public int maxChunksToSorted(int[] arr) {
        int currSum = 0, prefixSum = 0, count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            currSum += arr[i];
            prefixSum += i;
            if(currSum == prefixSum) count += 1;
        }

        return count;
    }
}