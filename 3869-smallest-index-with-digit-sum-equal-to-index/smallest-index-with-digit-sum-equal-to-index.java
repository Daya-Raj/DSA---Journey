class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            int z = nums[i];
            while(z>0){
                sum+=z%10;
                z = z/10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}