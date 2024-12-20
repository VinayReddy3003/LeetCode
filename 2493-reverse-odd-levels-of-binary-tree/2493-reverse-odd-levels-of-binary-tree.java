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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            List<TreeNode> levelNodes = new ArrayList<>();
            for(int i = 0;i<size;i++) {
                TreeNode currNode = q.poll();
                levelNodes.add(currNode);

                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);

            }
            if(level % 2 == 1) {
                  int n = levelNodes.size();
                  for(int j = 0;j<n/2;j++) {
                    int temp = levelNodes.get(j).val;
                    levelNodes.get(j).val = levelNodes.get(n-j-1).val;
                    levelNodes.get(n-j-1).val = temp;
                  }
            }
             level++;
        }
       return root;
    }
    
}