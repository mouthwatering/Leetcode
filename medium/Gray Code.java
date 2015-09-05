public class Solution {
    public List<Integer> grayCode(int n) {
        List <Integer> list = new ArrayList();
        list.add(0);
        if(n==0){
            return list;
        }
        list.add(1);
        if(n==1){
            return list;
        }
       
        int i = 1;
        while(i<n){
            int index =(1<<i)-1;
            while(index>=0){
                int tmp = list.get(index);
                tmp = tmp|(1<<i);
                list.add(tmp);
                index--;
            }
            i++;
        }
        return list;
    }
}