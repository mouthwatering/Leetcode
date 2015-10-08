{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    List<List<Integer>> list;\
    List<Integer> subList;\
    public List<List<Integer>> subsets(int[] nums) \{\
        Arrays.sort(nums);\
        list = new ArrayList<List<Integer>>();\
        subList = new ArrayList<Integer>();\
        for(int i = 0;i<=nums.length;i++)\{\
            getSubSet(list,subList,nums, 0,i);\
        \}\
        return list;\
    \}\
    \
    public void getSubSet(List<List<Integer>> list,List<Integer> subList,int []nums,int cur,int length)\{\
        if(length ==0)\{\
            List<Integer> newList = new ArrayList<Integer>();\
            newList.addAll(subList);\
            list.add(newList);\
        \}else\{\
            for(int i = cur;i<nums.length;i++)\{\
                subList.add(nums[i]);\
                List<Integer> newList = new ArrayList<Integer>();\
                newList.addAll(subList);\
                getSubSet(list,newList,nums,i+1,length-1);\
                subList.remove(subList.size()-1);\
            \}\
        \}\
    \}\
\}}