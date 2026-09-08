/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean AddPath(TreeNode root,List<TreeNode> path,TreeNode target){
        if(root==null)return false;
        path.add(root);
        if(root==target){
            return true;
        }
        if(AddPath(root.left,path,target)|| AddPath(root.right,path,target)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();
        AddPath(root,l,p);
        AddPath(root,l2,q);
        int i =0;
        while(i<l.size()&&i<l2.size()){
            if(l.get(i)!=l2.get(i)){
                break;
            }
            i++;
        }
        return l.get(i-1);
    }
}