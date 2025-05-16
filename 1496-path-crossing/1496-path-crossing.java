class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair> vis = new HashSet<>();
        int n = path.length();

        int x = 0, y = 0;
        vis.add(new Pair(x, y));

        for(char ch : path.toCharArray())
        {
            if(ch == 'N') y += 1;
            else if(ch == 'S') y -= 1;
            else if(ch == 'E') x += 1;
            else x -= 1;

            Pair point = new Pair(x, y);
            if(vis.contains(point)) return true;
            vis.add(point);
        }

        return false;
    }
}