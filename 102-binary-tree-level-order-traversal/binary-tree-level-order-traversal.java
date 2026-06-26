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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<>();
        if(root == null )return res;
        que.offer(root);
        while(!que.isEmpty()){
            int n = que.size();
            List<Integer> sub = new LinkedList<>();
            for(int i = 0 ;i<n;i++){
                if(que.peek().left != null){
                    que.offer(que.peek().left);
                }
                if(que.peek().right!= null){
                    que.offer(que.peek().right);
                }
                sub.add(que.poll().val);
            }
            res.add(sub);
        }
        return res;
    }
}