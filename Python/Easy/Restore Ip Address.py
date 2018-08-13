class Solution:
    def restoreIpAddresses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        rst = [];
        if len(s)< 4 or len(s)> 12:
            return rst;
    
        z = 0
        for i in range(z+1,min(z+4, len(s))):
            a = s[z:i]
            if(i == len(s)) :
                break;
            if int(a,10) > 255:
                break
            if(i-z>1) and s[z] == '0':
                break;
            for j in  range(i+1, min(i+4, len(s))):
                b = s[i:j]
                if(j == len(s)) :
                    break
                if int(b,10)> 255:
                    break
                if(j-i>1) and s[i] == '0':
                    break;
                for k in range(j+1, min(j+4, len(s))):
                    c = s[(j):k]
                    if(k == len(s)):
                        break;
                    if(int(c,10)>255):
                        break;
                    if(k-j>1) and s[j] == '0':
                        break;
                    for q in range(k+1, min(k+4,len(s)+1)):

                        if q == len(s):
                            d = s[k:q]
                            if int(d,10)>255:
                                break
                            if(q-k>1) and s[k] == '0':
                                break;
                            ip = a+'.'+b+'.'+c+'.'+d;
                            rst.append(ip)


        return rst;