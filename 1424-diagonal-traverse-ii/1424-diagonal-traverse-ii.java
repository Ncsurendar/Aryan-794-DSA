class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int maxSum = 0, totalElements = 0;

        for(int i = nums.size() - 1; i >= 0; i--)
        {
            for(int j = 0; j < nums.get(i).size(); j++)
            {
                int sum = i + j;
                maxSum = Math.max(maxSum, sum);
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(nums.get(i).get(j));
                totalElements++;
            }
        }

        int[] ans = new int[totalElements];
        int index = 0;
        for(int i = 0; i <= maxSum; i++)
        {
            List<Integer> list = map.get(i);
            if(list != null)
            {
                for(int num : list)
                {
                    ans[index++] = num;
                }
            }
        }

        return ans;
    }
}