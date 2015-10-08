{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 /**\
 * Definition for singly-linked list.\
 * public class ListNode \{\
 *     int val;\
 *     ListNode next;\
 *     ListNode(int x) \{ val = x; \}\
 * \}\
 */\
public class Solution \{\
    public ListNode swapPairs(ListNode head) \{\
        ListNode cur = new ListNode(0);\
        ListNode pre = cur;\
        cur.next = head;\
        while(cur.next!=null && cur.next.next!= null)\{\
            \
           ListNode tmp = cur.next ;\
           ListNode newHead = tmp.next.next;\
           cur.next = cur.next.next;\
           cur.next.next = tmp;\
           tmp.next = newHead;\
           cur = tmp;\
        \}\
        \
        return pre.next;\
    \}\
\}}