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

    int maxpath = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        maxpath = Integer.MIN_VALUE;
        Maxgain(root);
        return maxpath;
        
    }

    int Maxgain(TreeNode root){
         
          if(root == null) return 0;

          int leftgain = Math.max(Maxgain(root.left),0);

          int rightgain = Math.max(Maxgain(root.right),0);

          maxpath = Math.max(maxpath, leftgain+root.val+rightgain);

          return root.val + Math.max(leftgain, rightgain);
    }
}
