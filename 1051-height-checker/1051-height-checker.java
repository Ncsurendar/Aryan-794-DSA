class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for(int h : heights)
        {
            count[h]++;
        }

        int index = 0, result = 0;
        for(int height = 1; height <= 100; height++)
        {
            while(count[height] > 0)
            {
                if(heights[index] != height)
                {
                    result++;
                }
                index++;
                count[height]--;
            }
        }

        return result;
    }
}