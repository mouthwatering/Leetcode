{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 /**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode(int x) \{ val = x; \}\
 * \}\
 */\
public class Solution \{\
    List<List<Integer>> list = new ArrayList<List<Integer>>();\
    List<Integer> subList = new ArrayList<Integer>();\
    public List<List<Integer>> pathSum(TreeNode root, int sum) \{\
        getPath(root,subList,sum);\
        return list;\
    \}\
    public void getPath(TreeNode root,List<Integer> subList,int sum)\{\
        if(root!=null)\{\
            if(root.left ==null&& root.right == null &&root.val == sum)\{\
                 subList.add(root.val);\
                 List<Integer> newList = new ArrayList<Integer>();\
                 newList.addAll(subList);\
                 list.add(newList);\
                 subList.remove(subList.size()-1);\
            \}\
            if(root.left!=null)\{\
                subList.add(root.val);\
                List<Integer> newList = new ArrayList<Integer>();\
                 newList.addAll(subList);\
                 \
                 getPath(root.left,newList,sum-root.val);\
                 subList.remove(subList.size()-1);\
            \}\
            if(root.right!=null)\{\
                subList.add(root.val);\
                List<Integer> newList = new ArrayList<Integer>();\
                 newList.addAll(subList);\
                 getPath(root.right,newList,sum-root.val);\
                 subList.remove(subList.size()-1);\
            \}\
        \}\
    \}\
\}}