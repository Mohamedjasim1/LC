class Solution {
    int[][] dir = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };

    public int shortestBridge(int[][] grid) {

        int n = grid.length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    fillPath(grid, i, j);
                    flag = false;
                    break;
                }
                
            }
            if(!flag)break;
        }

        // for (int a[] : grid) {
        //     for (int b : a) {
        //         System.out.print(b + " ");
        //     }
        //     System.out.println();
        // }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    min = Math.min(min, shortestDist(grid, i, j));
                }
            }
        }

        return min;
    }

    public void fillPath(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid.length - 1)
            return;

        if (grid[i][j] == 2 || grid[i][j] == 0)
            return;

        grid[i][j] = 2;

        fillPath(grid, i + 1, j);
        fillPath(grid, i, j + 1);
        fillPath(grid, i - 1, j);
        fillPath(grid, i, j - 1);

    }

    public int shortestDist(int[][] grid, int i, int j) {

        Queue<int[]> q = new LinkedList<>();
        HashSet<String> set = new HashSet<>();

        q.add(new int[] { i, j });
        int dis = 0;
        while (!q.isEmpty()) {
            // 

           
            // dis++;

        int len=q.size();
        for(int k=0;k<len;k++){



            int[] cur = q.poll();

             String temp = cur[0] + "," + cur[1];
            if (set.contains(temp))
                continue;
            set.add(temp);
            
            for (int[] d : dir) {
                int r = cur[0] + d[0];
                int c = cur[1] + d[1];

                if (r < 0 || c < 0 || r > grid.length - 1 || c > grid.length - 1 || set.contains(r + "," + c))
                    continue;

                    if(grid[r][c]==1)continue;

                    if (grid[r][c] == 2)return dis;

                q.add(new int[] { r, c });

            }
        }
        dis++;

        }

        return Integer.MAX_VALUE;

    }
}