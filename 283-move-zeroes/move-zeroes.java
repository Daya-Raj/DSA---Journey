class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]==0 && nums[j]!=0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                else if(nums[i]==0 && nums[j]==0){
                    continue;
                }
            }
        }
    }
}