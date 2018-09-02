class Solution:
    def matrixScore(self, A):
        """
        :type A: List[List[int]]
        :rtype: int
        """
        if len(A) == 0:
            return 0
        N = len(A)
        M = len(A[0])
        for i in range(0, N):
            if A[i][0] == 0:
                for j in range(0, M):
                    A[i][j] = 1 - A[i][j]
                    
        if len(A[0]) > 1:
            for j in range(1, M):
                col = [ A[i][j] for i in range(0, N)];
                if sum(col) < N/2:
                    for i in range(0,N):
                        A[i][j] = 1 - A[i][j]
        rst = 0
        for i in range(0, N):
            s = '0b'
            for j in range(0,M):
                s = s + str(A[i][j])
            rst = rst + int(s, 2)
            
        return rst
            
        