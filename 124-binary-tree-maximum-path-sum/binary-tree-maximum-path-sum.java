/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
         Max(root);
        return max;
    }
    int Max(TreeNode root){
        if(root == null)return 0;
        int leftgain = Math.max(Max(root.left),0);
        int rightgain = Math.max(Max(root.right),0);
        max = Math.max(max,leftgain+root.val+rightgain);
        return root.val +Math.max(leftgain,rightgain);
    }
}