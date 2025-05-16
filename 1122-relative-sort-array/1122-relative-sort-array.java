class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            length = Math.max(length, arr1[i]);
        }

        int[] freq = new int[length + 1];
        for(int i = 0; i < arr1.length; i++)
        {
            freq[arr1[i]]++;
        }

        int[] ans = new int[arr1.length];
        int index = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            while(freq[arr2[i]] > 0)
            {
                ans[index] = arr2[i];
                freq[arr2[i]]--;
                index++;
            }
        }

        for(int i = 0; i < freq.length; i++)
        {
            while(freq[i] > 0)
            {
                ans[index] = i;
                freq[i]--;
                index++;
            }
        }

        return ans;
    }
}