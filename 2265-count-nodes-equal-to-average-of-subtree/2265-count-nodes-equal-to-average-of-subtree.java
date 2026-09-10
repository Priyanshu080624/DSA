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
    private int count =0;
    private int max =0;
    private  int result(TreeNode root){
        
        int sum = root.val;
        int sum1=0;
        int sum2=0;
        count++;
        if(root.left!=null)  sum1 = result(root.left);
        if(root.right!=null)  sum2 = result(root.right);
        return sum+sum1+sum2;

    };
    private void traverse(TreeNode root){
        int sum = 0;
        count =0;
        sum = result(root);
        if(sum/count==root.val) max++;
        if(root.left!=null) traverse(root.left);
        if(root.right!=null) traverse(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        
        traverse(root);
        return max;

    }
}