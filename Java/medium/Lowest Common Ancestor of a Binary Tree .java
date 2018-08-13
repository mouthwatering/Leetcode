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
    private boolean isFound = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null||p==null||q==null){
            return null;
        }
        findPath(root,p);
        LinkedList listp =(LinkedList) list.clone();

        System.out.println("p  "+ listp.size());
        if(list.size()!=0){
             list.removeAll(list);
        }
        isFound = false;
        findPath(root,q);
        LinkedList listq = list;
        System.out.println("q  "+ listq.size());
        
        ListIterator iterator_p = listp.listIterator();
        ListIterator iterator_q = listq.listIterator();
        TreeNode rst = root;
    
        while(iterator_p.hasNext()&&iterator_q.hasNext()){
            System.out.println("has previous");
            TreeNode m = (TreeNode)iterator_p.next();
            TreeNode n = (TreeNode)iterator_q.next();
            System.out.println(m.val);
            
            System.out.println(n.val);
            if( !m.equals(n )){
                return rst;
            }
            else {
                rst = m;
            }
        }
        return rst;
    }
    LinkedList<TreeNode> list = new LinkedList();
     private boolean findPath(TreeNode root, TreeNode node) {
        if (root == null)
            return false;
        if (root == node) {
            list.push(root);
            return true;
        } else {
            if (findPath(root.left, node) ||  findPath(root.right, node)) {
                list.push(root);
                return true;
            }
        }
        return false;
    }
}