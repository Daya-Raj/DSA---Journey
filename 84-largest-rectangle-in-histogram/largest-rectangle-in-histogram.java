class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            // Use 0 height for the virtual extra bar at the end to flush the stack
            int currentHeight = (i == n) ? 0 : heights[i];
            
            // Maintain monotonic increasing order in the stack
            while (!st.isEmpty() && heights[st.peek()] > currentHeight) {
                int height = heights[st.pop()];
                // If stack is empty, it means this bar is the shortest seen so far
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        
        return maxArea;
    }
}