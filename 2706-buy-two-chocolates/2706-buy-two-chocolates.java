class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min)
            {
                second_min = min;
                min = prices[i];
            }
            else if(prices[i] < second_min)
            {
                second_min = prices[i];
            }
        }

        int sum = min + second_min;
        if(sum > money) return money;
        return money - sum;
    }
}