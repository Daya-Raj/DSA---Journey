class Solution {

    public String stoneGameIII(int[] stoneValue) {

        int n = stoneValue.length;

        int dp1 = 0; // dp[i+1]
        int dp2 = 0; // dp[i+2]
        int dp3 = 0; // dp[i+3]

        int curr = 0;

        for (int i = n - 1; i >= 0; i--) {

            int best = Integer.MIN_VALUE;
            int runningSum = 0;

            // Take 1 stone
            runningSum += stoneValue[i];
            best = Math.max(best, runningSum - dp1);

            // Take 2 stones
            if (i + 1 < n) {
                runningSum += stoneValue[i + 1];
                best = Math.max(best, runningSum - dp2);
            }

            // Take 3 stones
            if (i + 2 < n) {
                runningSum += stoneValue[i + 2];
                best = Math.max(best, runningSum - dp3);
            }

            curr = best;

            // Shift values
            dp3 = dp2;
            dp2 = dp1;
            dp1 = curr;
        }

        if (dp1 > 0)
            return "Alice";
        else if (dp1 < 0)
            return "Bob";
        else
            return "Tie";
    }
}