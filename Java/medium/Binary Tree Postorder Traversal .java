/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }
    public void traversal(TreeNode root){
        if(root== null) return;
        if(root.left!=null){
            traversal(root.left);
        }
        if(root.right!=null){
            traversal(root.right);
        }
        list.add(root.val);
    }
}