class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1,res=0;
        while(left<right){
        int h = Math.min(height[left],height[right]);
        int width = right-left;
        int area = h*width;
        res = Math.max(area,res);
        if(height[left]<height[right]){
         left++;
        }
        else{
            right--;
        }
        }
        return res;
    }
}