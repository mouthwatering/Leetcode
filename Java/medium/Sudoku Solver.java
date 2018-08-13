{\rtf1\ansi\ansicpg936\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    \
    public void solveSudoku(char[][] board) \{\
         getSolution(board);\
    \}\
    \
    public boolean getSolution(char [][] board)\{\
        for(int i =0;i<=8;i++)\{\
            for(int j =0;j<=8;j++)\{\
                if(board[i][j] =='.')\{\
                    for(char num = '1';num<='9';num++)\{\
                        board[i][j] = num;\
                        if(!inBlock((char)num,i,j,board) && !inRow((char)num,i,j,board)  &&!inCol((char)num,i,j,board) && getSolution(board))\{\
                            return true;    \
                        \}\
                        board[i][j] = '.';\
                    \}\
                    return false;\
                \}\
                   \
            \}\
        \}\
        return true;\
    \}\
   \
    public boolean inBlock(char num,int i,int j, char[][] board)\{\
        for(int m = (i/3)*3+0;m<(i/3+1)*3;m++)\{\
            for(int n = (j/3)*3+0;n<(j/3+1)*3;n++)\{\
                if(m!=i&&n!=j&&num == board[m][n])\{\
                    return true;\
                \}\
            \}\
        \}\
        return false;\
    \}\
    \
    public boolean inRow(char num,int i,int j, char[][] board)\{\
        for(int k = 0;k<=8;k++)\{\
            if(k!=j &&num == board[i][k])\{\
                return true;\
            \}\
        \}\
        return false;\
    \}\
    public boolean inCol(char num,int i,int j, char[][] board)\{\
        for(int k = 0;k<=8;k++)\{\
            if(k!=i &&num == board[k][j])\{\
                return true;\
            \}\
        \}\
        return false;\
    \}\
\}}