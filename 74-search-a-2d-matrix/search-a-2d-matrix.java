class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row:matrix){
            if(isFound(row,target))return true;
            
        }
        return false;
    }
    boolean isFound(int[] arr,int target){
        int left = 0,right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]<target)left = mid+1;
            else{right = mid-1;
            }
        }
        return false;
    }
}