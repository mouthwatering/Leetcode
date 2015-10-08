{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public boolean search(int[] A, int target) \{\
         int l = 0;\
        int r = A.length - 1;\
        while(l <=r)\
        \{\
            int mid = (l + r) >> 1;\
            if(A[mid] == target)\
                return true;\
            if(A[l] < A[mid])\
            \{\
                if(A[l] <= target && target < A[mid])\
                    r = mid - 1;\
                else\
                    l = mid + 1;\
            \}\
            else if(A[l]>A[mid])\
            \{\
                if(A[mid] < target && target <= A[r])\
                    l = mid + 1;\
                else\
                    r = mid - 1;\
            \}else\{\
                l++;\
            \}\
        \}\
        return false;\
    \}\
\}}