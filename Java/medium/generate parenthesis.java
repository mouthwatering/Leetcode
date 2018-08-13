{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    List<String> list = new ArrayList<String>();\
    String s = new String("");\
    public List<String> generateParenthesis(int n) \{\
        getParenthesis(s,0,0,n);\
        return list;\
    \}\
    public void   getParenthesis(String s,int left,int right,int n)\{\
        if(left == n && right==n)\{\
            list.add(new String(s));\
        \}\
        else if(left ==n)\{\
            String tmp = new String(s+')');\
              getParenthesis(tmp,left,right+1,n);\
        \}\
        else\{\
            if(left == right)\{\
              String tmp = new String(s+'(');  \
                getParenthesis(tmp,left+1,right,n);\
            \}else\{\
                  String tmp = new String(s+'(');  \
                    getParenthesis(tmp,left+1,right,n);\
                  \
                   String tmp2 = new String(s+')');  \
                    getParenthesis(tmp2,left,right+1,n);\
            \}\
        \}\
    \}\
\}}