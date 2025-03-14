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
    public List<Integer> largestValues(TreeNode root) {
     List<Integer> result = new ArrayList<>();
     if(root == null) {
        return result;
     }   
     Queue<TreeNode> q = new LinkedList<>();
     q.offer(root);

     while(!q.isEmpty()) {
        int size = q.size();
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++) {
            TreeNode current = q.poll();
             maxVal = Math.max(current.val,maxVal);

            if(current.left!=null) {
                q.offer(current.left);
            }
            if(current.right != null) {
                q.offer(current.right);
            }
        }
        result.add(maxVal);
     }
     return result;



    }
}