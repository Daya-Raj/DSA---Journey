class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xmin = Math.max(x1,Math.min(xCenter,x2));
        int ymin = Math.max(y1,Math.min(yCenter,y2));
        int dis = (xmin - xCenter) * (xmin - xCenter)+(ymin - yCenter) * (ymin - yCenter);
        return dis<=(radius*radius);
    }
}