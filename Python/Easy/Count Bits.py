class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
       
        if num == 0: return [0];
        if num == 1: return [0,1];
        
        rst = [0 for i in range(0, num + 1)]
        rst[0] = 0;
        rst[1] = 1;
        count = 1;
        k = 1;
        for i in range(2, num + 1):
            if i == 2**k:
                rst[i] = 1
                k = k +1
            elif i > 2**(k-1) and i < 2**k:
                rst[i] = count + rst[i - 2**(k-1)]
        
        return rst;