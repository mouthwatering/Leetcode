public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<integer> res = new ArrayList<integer>();
        int count1 =0,count2 = 0,candicate1 = 0,candicate2 = 1;
        for(int i:nums){
            if(i == candicate1){
                count1++;
            }else if(i ==candicate2){
                count2++;
            }else if(count1 ==0){
                cadicate1 = i;
                count1 =1;
            }else if(count2 ==0){
                candicate2 = i;
                count2 = 1;
            }else{
                count1 --;
                count2--;
            }
        }
        
        count1 = 0;count 2 = 0;
        for(int i :nums){
            if(candicate1 == i){
                count1 +=2;
            }else{
                count1 --;
            }
            if(candicate2 == i){
                count2 +=2;
            }else {
                count2 --;
            }
        }
        if(count1>0) res.add(candicate1);
        if(count2>0) res.add(candicate2);
        return res;
    }
}