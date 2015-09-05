public class Solution {
    public int maxArea(int[] height) {
        if(height.length ==0 ){
            return 0;
        }
        int left = 0;
        int right = height.length -1;
        int max =0;
        int min = height[0];
        while(left<=right){
            if(max < Math.min(height[left],height[right])*(right - left)){
                min = Math.min(height[left],height[right]);
                max = min *(right - left);
            }
            if(height[left]<height[right]){
                left  = left+1;
            }
            else{
                right = right -1;
            }
            
        }
        return max;
    }
}