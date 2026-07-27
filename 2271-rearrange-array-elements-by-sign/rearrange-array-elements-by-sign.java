class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pos = 0;
        int neg =  1 ;
        for(int i:nums){
            if(i<0){
                arr[neg]=i;
                neg+=2;
            }
            else{
                arr[pos]=i;
                pos+=2;
            }
        }
        return arr;
    }
}