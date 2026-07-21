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
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set  = new HashSet<>();
        inorder(root,set);
        return set.size()==1;
    }
    public void inorder(TreeNode root,Set<Integer> set)
    {
        if(root == null)return;

        inorder(root.left,set);
        set.add(root.val);
        inorder(root.right,set);
    }
}