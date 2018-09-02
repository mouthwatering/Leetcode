class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        max_value = 0
        left = 0
        right = 0
        array = [[0 for i in range(0, len(s))] for j in range(0, len(s))]
        for i in range(len(s)-1, -1, -1):
            for j in range(i, len(s)):
                if j -i  ==  1 and s[i] == s[j]:
                        array[i][j] = 1
                elif i == j:
                        array[i][j] = 1
                else:
                    if s[i] == s[j] and array[i+1][j-1] == 1:
                        array[i][j] = 1
                if  array[i][j] == 1:
                    if j - i +1  > max_value:
                            left = i
                            right = j
                            max_value = j - i +1

        return s[left: right +1]

s = Solution()
str = "babbsd"
print(s.longestPalindrome(str))
