class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : hand)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>(freq.keySet());
        while(!minheap.isEmpty())
        {
            int first = minheap.peek();
            for(int i = 0; i < groupSize; i++)
            {
                int curr = first + i;
                if(!freq.containsKey(curr)) return false;

                freq.put(curr, freq.get(curr) - 1);
                if(freq.get(curr) == 0)
                {
                    freq.remove(curr);
                    if(curr == minheap.peek()) minheap.poll();
                }
            }
        }

        return true;
    }
}