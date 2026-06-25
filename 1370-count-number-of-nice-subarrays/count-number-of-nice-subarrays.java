class Solution { 
    public int numberOfSubarrays(int[] nums, int k) { 
        int l = 0; 
        int r = 0; 
        int count = 0; 
        int res = 0; 
        int n = nums.length; 
        int validSubarrays = 0; 
        while (r < n) {
           
            if (nums[r] % 2 != 0) { 
                count++;
                validSubarrays = 0; 
            }
            while (count > k || (l <= r && count == k && nums[l] % 2 == 0)) { 
                if (nums[l] % 2 != 0) { 
                    count--; 
                } else {
                    validSubarrays++; 
                }
                l++; 
            }
            if (count == k) { 
                res += (validSubarrays + 1); 
            } 
            r++; 
        } 
        return res; 
    } 
}
