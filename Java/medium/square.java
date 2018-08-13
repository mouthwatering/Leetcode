{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int numSquares(int n) \{\
        int t = (int)Math.floor(Math.sqrt((double)n));\
        int []res = new int[n+1];\
        res[0] =0;\
        int cur =0;\
        for(int i = 1;i<=n;i++)\{\
            int min = Integer.MAX_VALUE;\
            int min_index = 1;\
            for(int j = 1;j<=t;j++)\{\
                if(i- j*j>=0)\{\
                    if(res[i-j*j]+1<min)\{\
                        min = res[i-j*j] + 1;\
                        min_index = j;\
                    \}\
                \}\
                else\{\
                    break;\
                \}\
            \}\
            res[i] = min;\
        \}\
        return res[n];\
    \}\
\}}