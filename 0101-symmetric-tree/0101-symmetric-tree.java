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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmentricHelper(root.left,root.right);
    }
    private boolean isSymmentricHelper(TreeNode left,TreeNode right) {
        if(left ==null && right == null) {
            return true;
        }
        if(left == null || right == null || left.val != right.val) {
         return false;
        }
      
        return isSymmentricHelper(left.left,right.right) && 
               isSymmentricHelper(left.right,right.left);
    }
}