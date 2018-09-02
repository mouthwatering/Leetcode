class Solution:
    def minSteps(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1: return 0;
        if n == 2: return 2;
        if n == 3: return 3;
        if n == 4: return 4;

        str = [0] * (n)
        str[0] ,str[1],str[2],str[3] = 0,2,3,4;

        for i in range(4, n):
            j = 2
            minValue = i + 1
            while j < i :
                if (i+1)%j == 0 :
                    minValue = min(minValue, (i+1)/j + str[j-1])
                j = j + 1;
                str[i] = int(minValue)
        print(str)
        return str[-1]

s = Solution()
print(s.minSteps(12))
