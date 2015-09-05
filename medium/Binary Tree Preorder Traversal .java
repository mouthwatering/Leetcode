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
    public List<Integer> preorderTraversal(TreeNode root) {
        List list = new ArrayList();
        Stack stack = new Stack();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode tmp = (TreeNode)stack.pop();
            if(tmp!=null){
                list.add(tmp.val);
                stack.push(tmp.right);
                stack.push(tmp.left);
            }
        }
        return list;
    }
}