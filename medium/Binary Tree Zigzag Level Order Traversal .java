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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         LinkedList<Integer> nums = new LinkedList<Integer>();
        List < List<Integer>> list = new  LinkedList< List<Integer>>();
        if(root == null)
            return list;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();    
        TreeNode endNode = root;
        queue.push(root);
        int level = 0;
        while(queue.size()!=0){
            TreeNode tmp = queue.pop();
            if(level%2 ==0 ){
                nums.add(tmp.val);
            }else{
                nums.push(tmp.val);
            }
            if(tmp.left!=null)    queue.add(tmp.left);
            if(tmp.right!=null)   queue.add(tmp.right);  
                
            if(tmp.equals(endNode)){
               level++;
               LinkedList rows =(LinkedList) nums.clone();// clone 要学会使用，只有linkedlist 才有clone 方法
               list.add(rows);
               nums.clear();
               endNode = queue.peekLast();
            }
        }
        return list;
    }
}