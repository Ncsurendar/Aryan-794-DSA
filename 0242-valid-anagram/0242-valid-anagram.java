class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            char th = t.charAt(i);
            count[ch - 'a']++;
            count[th - 'a']--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(count[i] != 0) return false;
        }

        return true;        
    }
}