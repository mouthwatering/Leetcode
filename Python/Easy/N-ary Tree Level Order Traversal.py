"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        
        if root is None:
            return [];
        res= []
        res.append([root.val])
        
        node_queue = [];
        node_queue.append([root]);
        
        i = 0;
        
        while i <len(node_queue):
            l = [];
            l_node = [];
            isAdded = False;
            for n in node_queue[i]:
                for r in n.children:
                    l.append(r.val)
                    l_node.append(r)
                    isAdded = True
            if isAdded == True:
                res.append(l)
                node_queue.append(l_node)
            i = i +1;
        return res;
                
                
            