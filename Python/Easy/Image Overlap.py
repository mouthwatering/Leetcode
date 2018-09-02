class Solution:
    def largestOverlap(self, A, B):
        """
        :type A: List[List[int]]
        :type B: List[List[int]]
        :rtype: int
        """
        if A is None and B is None:
            return 0;
        rst = 0;
        length = len(A)


        array = [[0 for col in range(3*length -2)] for row in range(3*length -2)]


        for i in range(0,len(A)):
            for j in range(0,len(A)):
                    array[length -1 +i][length -1 +j] = A[i][j]

        if length ==1:
            rst = A[0][0] and A[0][0]
            return rst;
        for i in range(0, 2*length - 2):
            for j in range(0, 2*length - 2 ):
                temp = 0
                for m in range(0,length):
                    for n in range(0, length):
                        temp = temp + (array[i+m][j+n] and B[m][n])
                rst = rst if rst > temp else temp

        return rst
# A = [[1,1,0],[0,1,0],[0,1,0]]
# B = [[0,0,0],[0,1,1],[0,0,1]]
A= [[1]]
B = [[1]]
s = Solution()
num = s.largestOverlap(A,B)
print(num)
