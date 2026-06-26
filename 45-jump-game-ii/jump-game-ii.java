class Solution {
    public int jump(int[] nums) {
        int res = 0; 
        int end = 0;  
        int reachable = 0; 
        for(int i = 0; i < nums.length - 1; ++i){
            reachable = Math.max(reachable, i + nums[i]);
            if(reachable >= nums.length - 1){
                ++res;
                break;
            }            
            if( i == end ){
                ++res; 
                end = reachable;
            }             
        }
        return res;        
    }
}
    
