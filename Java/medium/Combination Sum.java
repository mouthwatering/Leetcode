{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    List<List<Integer>> list = new ArrayList<List<Integer>>();\
    List<Integer> subList = new ArrayList<Integer>();\
    public List<List<Integer>> combinationSum(int[] candidates, int target) \{\
        Arrays.sort(candidates);\
        dfs(subList,0,target,candidates);\
        return list;\
    \}\
    public void dfs(List<Integer> subList,int cur, int target, int [] candidates)\{\
        if(target == 0)\{\
            List<Integer> newList = new ArrayList<Integer>();\
            newList.addAll(subList);\
            list.add(newList);\
        \}\
        if(target>0)\{\
            for(int i = cur;i<candidates.length;i++)\{\
                subList.add(candidates[i]);\
                List<Integer> newList = new ArrayList<Integer>();\
                newList.addAll(subList);\
                dfs(newList,i,target-candidates[i],candidates);\
                subList.remove(subList.size()-1);\
            \}\
        \}\
        \
    \}\
\}}