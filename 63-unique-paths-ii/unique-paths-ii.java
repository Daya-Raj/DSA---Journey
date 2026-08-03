class Solution {
    private int solve(int m,int n ,int[][] matrices,int[][] dp){
        if(m<0 || n<0 || matrices[m][n]!=0)return 0;
        if(m==0 && n==0)return 1;
        if(dp[m][n] != -1)return dp[m][n];
        int left = solve(m-1,n,matrices,dp);
        int rigth = solve(m,n-1,matrices,dp);
        return dp[m][n] = left+rigth;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(m-1,n-1,obstacleGrid,dp);
    }
}