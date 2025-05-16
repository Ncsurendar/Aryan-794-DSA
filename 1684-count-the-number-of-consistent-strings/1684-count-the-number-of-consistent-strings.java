class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray())
        {
            set.add(ch);
        }

        int count = 0;
        for(String word : words)
        {
            boolean isConsistent = true;
            for(char ch : word.toCharArray())
            {
                if(!set.contains(ch))
                {
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent) count += 1;
        }

        return count;
    }
}