public class Solution {
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int count = 1;
        int index_2 = 0,index_3 = 0,index_5=0;
        while(count<n){
            int small = min(list.get(index_2)*2,list.get(index_3)*3,list.get(index_5)*5);
            list.add(small);
            count++;
            while(index_2<count&&list.get(index_2)*2 <= list.get(list.size()-1)) index_2++;
            while(index_2<count&&list.get(index_3)*3 <= list.get(list.size()-1)) index_3++;
            while(index_2<count&&list.get(index_5)*5 <= list.get(list.size()-1)) index_5++;
            
        }
        
        return list.get(count-1);
    }
    
    public int min(int a ,int b,int c){
        int minimum = a;
        minimum = minimum<b?minimum:b;
        minimum =  minimum<c? minimum:c;
        return minimum;
    }
}