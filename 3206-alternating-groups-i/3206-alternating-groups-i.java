class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;

        if(colors[0] != colors[n - 1] && colors[0] != colors[1]) count += 1;
        if(colors[n - 1] != colors[n - 2] && colors[n - 1] != colors[0]) count += 1;

        for(int i = 1; i < n - 1; i++)
        {
            if(colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) count += 1;
        }

        return count;
    }
}