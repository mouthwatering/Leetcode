{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int minimumTotal(List<List<Integer>> triangle) \{\
        if(triangle == null)\{\
            return 0;\
        \}\
        for(int i = triangle.size()-1-1;i>=0;i--)\{\
            for(int j = 0;j<triangle.get(i).size();j++)\{\
                if(j+1<triangle.size())\{\
                    triangle.get(i).set(j,triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));\
                \}\
                else\{\
                    \
                \}\
            \}\
        \}\
        return triangle.get(0).get(0);\
    \}\
\}}