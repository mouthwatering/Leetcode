{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public boolean wordBreak(String s, Set<String> wordDict) \{\
        boolean dp[] = new boolean[s.length()+1];\
        dp[0] =true;\
        for(int i = 1;i<=s.length();i++)\{\
            for(int j = 0;j<i;j++)\{\
                if(dp[j] == true && wordDict.contains(s.substring(j,i)))\{\
                     dp[i] = true;\
                     break;\
                \}\
                   \
            \}\
        \}\
        return dp[s.length()];\
    \}\
\}}