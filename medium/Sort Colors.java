// using quick sort theory
public class Solution {
    public void sortColors(int[] nums) {
        int start = 0,end = nums.length-1;int i=start+1,j =end;
        int count=2,key=0, temp;
        while(count>=1){
            
                if(count==2){
                    i = start;j = end;
                    key = 0;
                }
                if(count ==1){
                    start = j+1;
                    i=start;
                    j=end;
                    key = 1;
                }
                if(start<end){
                    while(true){
                        while(j>=0&&nums[j]>key) j--;
                        while(i<j&&nums[i]<=key) i++;
                        if(i>=j)
                            break;
                        temp = nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                    }
                }
          count--;
       }

    }
}