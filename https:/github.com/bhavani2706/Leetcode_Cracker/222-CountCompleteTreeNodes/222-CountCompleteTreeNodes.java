// Last updated: 09/07/2026, 09:49:26
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
    public int countNodes(TreeNode root) {
        int val=traversal(root);
        return val;
        }
       public static int traversal(TreeNode root){
       if(root==null)
       return 0;
       return 1+traversal(root.left)+traversal(root.right);
    }
}