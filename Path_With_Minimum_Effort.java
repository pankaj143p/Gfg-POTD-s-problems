class Solution {

    public int minCostPath(int[][] heights) {

        int rows = heights.length;
        int columns = heights[0].length;

        int[][] effort = new int[rows][columns];
        for (int[] e : effort) Arrays.fill(e, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{0, 0, 0});
        effort[0][0] = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int r = curr[0], c = curr[1], currEff = curr[2];

            if (r == rows - 1 && c == columns - 1)
                return currEff;

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < columns) {
                    int diff = Math.abs(heights[nr][nc] - heights[r][c]);
                    int newEff = Math.max(currEff, diff);

                    if (newEff < effort[nr][nc]) {
                        effort[nr][nc] = newEff;
                        pq.offer(new int[]{nr, nc, newEff});
                    }
                }
            }
        }

        return -1;
    }
}

