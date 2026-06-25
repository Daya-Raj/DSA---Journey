class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int l = 0;
        int n = nums.length;
        int sum = 0;
        int r = 0;
        
        while (r < n) {
            sum += nums[r];
          
            while (l < r && sum > goal) {
                sum -= nums[l];
                l++;
            }
            if (sum == goal) {
                int tempL = l;
               
                while (tempL < r && nums[tempL] == 0) {
                    count++;
                    tempL++;
                }
                count++; 
            }
            
            r++;
        }
        return count;
    }
}
