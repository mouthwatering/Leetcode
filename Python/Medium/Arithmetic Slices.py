class Solution:
    def numberOfArithmeticSlices(self, A):
        """
        :type A: List[int]
        :rtype: int
        """

        N = len(A)
        if N < 3: return 0
        self.getArray(N)

        i = 1;
        rst = 0
        stack = []
        while(i < N):
            temp_rst = 0
            while((len(stack) > 0) and stack[-1] != (A[i] - A[i-1])):
                stack.pop();
            while((len(stack) == 0) or ( i < N and stack[-1] == (A[i] - A[i-1]))):
                stack.append(A[i] - A[i-1])
                l = len(stack)
                temp_rst =  self.array[l]
                i = i + 1
            rst = rst +temp_rst

        return rst;
    def getArray(self, N):
        self.array = [0,0,1]
        for i in range(3, N):
            temp = 1
            for j in range(2, i):
                temp +=  (i -j + 1)
            self.array.append(temp)