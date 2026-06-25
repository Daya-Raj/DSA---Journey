class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int l = 0;
        int zeroCount = 0;
        int n = nums.length;

        for (int r = 0; r < n; r++) {
            // 1. Expand the window by incorporating the right element
            if (nums[r] == 0) {
                zeroCount++;
            }

            // 2. Shrink the window from the left if we have too many zeros
            while (zeroCount > k) {
                if (nums[l] == 0) {
                    zeroCount--;
                }
                l++; // Shrink window
            }

            // 3. Update the maximum length of a valid window
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
