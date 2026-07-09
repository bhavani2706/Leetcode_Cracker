// Last updated: 09/07/2026, 10:02:16
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
   public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> leaf1 = new ArrayList<>();
    List<Integer> leaf2 = new ArrayList<>();
    getLeaves(root1, leaf1);
    getLeaves(root2, leaf2);
    return leaf1.equals(leaf2);
} 
private void getLeaves(TreeNode root, List<Integer> leaves) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
        leaves.add(root.val);
    } else {
        getLeaves(root.left, leaves);
        getLeaves(root.right, leaves);
    }
}
}