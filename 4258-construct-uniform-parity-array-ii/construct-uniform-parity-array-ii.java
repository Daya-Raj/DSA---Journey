class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0;
        int min = Integer.MAX_VALUE;
        for(int i:nums1){
            if(i<min){
                min = i;
            }
            if(i%2!=0){
                oddCount++;
            }
        }
        if(min%2!=0){
            return true;
        }
        if(min%2==0 && oddCount==0){
            return true;
        }
        return false;
    }
}