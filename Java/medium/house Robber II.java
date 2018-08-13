{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int rob(int[] nums) \{\
        if(nums==null||nums.length==0)\{\
            return 0;\
        \}\
        int max1 = Integer.MIN_VALUE;\
        int max2 = Integer.MIN_VALUE;\
        int dp[] = new int[nums.length+1];\
        dp[0] = 0;\
        dp[1] = nums[0];\
        if(nums.length ==1)\{\
            return dp[1];\
        \}\
        for(int i =2;i<=nums.length;i++)\{\
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);\
        \}\
        max1 =dp[nums.length-1];\
        \
        dp[0] = 0;\
        dp[1] = 0;\
        for(int i =2;i<=nums.length;i++)\{\
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);\
        \}\
        max2 = dp[nums.length];\
        return max1>max2?max1:max2;\
    \}\
\}}