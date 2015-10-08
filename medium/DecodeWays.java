{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int numDecodings(String s) \{\
         if(s == null||s.length()==0)\{\
	            return 0;\
	        \}\
	        int  prepre = 0;\
	        int pre = 1;\
	        char last = '3';\
	        int cur = 1;\
	        for(int i=0;i<s.length();i++)\{\
	        	if(('0'<s.charAt(i)&&s.charAt(i)<='9' &&last=='1'))\{\
	        		cur = prepre + pre;\
	        	\}\
	        	else if('0'<s.charAt(i)&&s.charAt(i)<='6'&&(last=='2'))\{\
	                cur = prepre + pre;\
	            \}else if(s.charAt(i)>'0')\{\
	                cur = pre;\
	            \}else if(s.charAt(i) =='0')\{\
	                \
	                if(last>'0'&&last<='2')\{\
	                    if(i == 1)\{\
	                        cur = 1;\
	                    \}\
	                    else if(i>=2)\{\
	                    	if(s.charAt(i-1)>='1'&&s.charAt(i-1)<='2')\{\
	                    		cur = prepre;\
	                    	\}else\{\
	                    		return 0;\
	                    	\}\
	                    \}\
\
	                    \
	                \}else \{\
	                    \
	                    return 0;\
	                \}\
	            \}\
	            prepre = pre;\
	            pre = cur;\
	            last = s.charAt(i);\
	        \}\
	        return cur;\
    \}\
\}}