class Solution:
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        char = []
        for i in range(0, len(S)):
            if S[i] == C:
                char.append(i)
        print(char)
        rst = []
        for i in range(0, len(S)):
            rst.append(self.findMin(char,i, len(S)))

        return rst;
    
    def findMin(self, arr, num,l ) :
        m = l;
        for i in range(0, len(arr)):
           if abs(arr[i] - num) < m :
               m = abs(arr[i]  - num)
        return m
