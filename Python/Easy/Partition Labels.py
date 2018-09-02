class Solution:
    def partitionLabels(self, S):
        """
        :type S: str
        :rtype: List[int]
        """
        IndexDict = {}
        CountArray = [0 for i in range(0, len(S))]
        for i in range(0, len(S)):
            CountArray[i] = 1;
            if S[i] not in IndexDict :
                IndexDict.setdefault(S[i], i)
            else:
                CountArray[i] += 1;
      
        rst = [];
        if len(S) == 0: return 0;
        
        i = len(S) - 1
        while(i >= 0 ):
            num = 1;
            if CountArray[i] == 1:
                rst.insert(0, num)
                i = i - 1;
            else :
                j = 0;
                num = 2
                while j < num - 1:
                    k = i - j;
                    if CountArray[k] > 1 :
                        diff = i - j - IndexDict[S[i - j]] + 1
                        num = num if num > j + diff else j + diff
                    j = j + 1
                rst.insert(0, num)
                i = i - j - 1;
        return rst;

                    
            
            