class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[][] dp = new long[n][k];
        long[] result = new long[k]; 
        for(int i = 0;i<n;i++){
            dp[i][nums[i]%k]++;
            if(i>0){
                for(int r = 0;r<k;r++){
                    int nextRem = (int)(((long)r*nums[i])%k);
                    dp[i][nextRem]+=dp[i-1][r];
                }
            }
            for(int r = 0;r<k;r++){
                result[r]+=dp[i][r];

            }
        } 
        return result;      
    }
}