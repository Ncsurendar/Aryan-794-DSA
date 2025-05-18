class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>(freq.keySet());
        while(!minheap.isEmpty())
        {
            int first = minheap.peek();
            for(int i = 0; i < k; i++)
            {
                int curr = first + i;
                if(!freq.containsKey(curr)) return false;

                freq.put(curr, freq.get(curr) - 1);
                if(freq.get(curr) == 0)
                {
                    freq.remove(curr);
                    if(minheap.peek() == curr) minheap.poll();
                }
            }
        }

        return true;
    }
}