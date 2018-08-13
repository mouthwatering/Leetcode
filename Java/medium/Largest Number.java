public class Solution {
    public String largestNumber(int[] nums) {
        if(nums ==null){
            return "";
        }
        nums = sort(nums,0,nums.length-1);
        StringBuilder sb = new StringBuilder();
        boolean zeroFlag = false;
        for(int i =0;i<nums.length;i++){
            sb=sb.append(String.valueOf(nums[i]));
            if(nums[i]!=0){
                zeroFlag = true;
            }
        }
        return zeroFlag ==true?sb.toString():"0";
    }
    
    int[] sort(int [] nums,int start,int end){
        if(start>=end){
            return nums;
        }
        int temp;
        int i = start+1,j = end,key = nums[start];
        while(true){
            while(compare(nums[j],key)==-1) j--;
            while(compare(nums[i],key)==1&&i<j) i++;
          
            if(i>=j){
                break;
            }
       
            temp = nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            if(compare(nums[i],key)==0){
                i++;
            }else{
                j--;
            }
        }
        temp = nums[j];
        nums[j]=key;
        nums[start]=temp;
        sort(nums,start,j-1);
        sort(nums,j+1,end);
        return nums;
    }
    
    int compare(int a, int b){
        String str_a =String.valueOf(a);
        String str_b = String.valueOf(b);
        int la = str_a.length(),lb = str_b.length();
        int l = Math.max(la,lb);
        int i = 0;
        while(i<l){
            if(i<la&&i<lb&&str_a.charAt(i)<str_b.charAt(i)){
                return -1;
            }else if(i<la&&i<lb&&str_a.charAt(i)>str_b.charAt(i)){
                return 1;
            }else if(i<la&&i<lb&&str_a.charAt(i)==str_b.charAt(i)){
                i++;
            }else if(i==la&&i==lb){
                return 0;
            }else if(i>=la){
                int j =0;
                while(j<la){
                    if(str_b.charAt(i)>str_a.charAt(j)){
                        return -1;
                    }else if(str_b.charAt(i)<str_a.charAt(j)){
                        return 1;
                    }
                    j++;
                }
                i++;
            }else if(i>=lb){
                int j =0;
                while(j<lb){
                    if(str_a.charAt(i)>str_b.charAt(j)){
                        return 1;
                    }else if(str_a.charAt(i)<str_b.charAt(j)){
                        return -1;
                    }
                    j++;
                }
                i++;
            }
        }
        return 0;
    }
    
}