class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int row, int col,
                    int originalColor, int color) {

        // Out of bounds
        if (row < 0 || col < 0 ||
            row >= image.length || col >= image[0].length) {
            return;
        }

        // Not the original color
        if (image[row][col] != originalColor) {
            return;
        }

        // Change color
        image[row][col] = color;

        // UP
        dfs(image, row - 1, col, originalColor, color);

        // DOWN
        dfs(image, row + 1, col, originalColor, color);

        // LEFT
        dfs(image, row, col - 1, originalColor, color);

        // RIGHT
        dfs(image, row, col + 1, originalColor, color);
    }
}