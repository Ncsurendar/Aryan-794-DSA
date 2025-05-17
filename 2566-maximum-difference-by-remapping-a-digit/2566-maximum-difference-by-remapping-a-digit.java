class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char[] maxArr = s.toCharArray();
        char[] minArr = s.toCharArray();

        // For Maximum value
        for(int i = 0; i < maxArr.length; i++)
        {
            if(maxArr[i] < '9')
            {
                char replaceValue = maxArr[i];
                for(int j = 0; j < maxArr.length; j++)
                {
                    if(maxArr[j] == replaceValue)
                    {
                        maxArr[j] = '9';
                    }
                }
                break;
            }
        }

        //For Minimum value
        for(int i = 0; i < minArr.length; i++)
        {
            if(minArr[i] > '0')
            {
                char replaceValue = minArr[i];
                for(int j = 0; j < minArr.length; j++)
                {
                    if(minArr[j] == replaceValue)
                    {
                        minArr[j] = '0';
                    }
                }
                break;
            }
        }

        int maxNum = Integer.parseInt(new String(maxArr));
        int minNum = Integer.parseInt(new String(minArr));
        return maxNum - minNum;
    }
}