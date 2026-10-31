
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length; 
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfs(grid, visited, i, j);
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        int n = grid.length;
        int m = grid[0].length;
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];
            for (int k = 0; k < 4; k++) {
                int newRow = r + dRow[k];
                int newCol = c + dCol[k];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}