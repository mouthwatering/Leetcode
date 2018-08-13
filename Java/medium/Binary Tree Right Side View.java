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
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList queue = new LinkedList();
        if(root ==null){
            return queue;
        }
        List list = new ArrayList();
        TreeNode endNode = root;
        queue.push(root);
        while(queue.size() != 0){
            TreeNode tmp = (TreeNode)queue.pop();
            if(tmp.left !=null ){
                queue.add( tmp.left);
            }
            if(tmp.right !=null){
                queue.add( tmp.right);
            }
            if(tmp == endNode){
                list.add(tmp.val);
                endNode = (TreeNode)queue.peekLast();
            }
        }
        return list;
    }
}