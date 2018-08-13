public class Solution {
    public int compareVersion(String version1, String version2) {
         String[] array1=version1.split("\\.");
         String[] array2=version2.split("\\.");//need to add \\
         int i = 0,num2,num1;
         int length = array1.length>array2.length?array2.length:array1.length;
         System.out.println(array2.length+" "+array1.length);
         for(i=0;i<length;i++){
             num1 = Integer.valueOf(array1[i]);
             num2 = Integer.valueOf(array2[i]);
             System.out.println(num1+" "+num2);
             if(num1==num2){}
             else if(num1>num2){
                 return 1;
             }else{
                 return -1;
             }
         }
         if(array1.length>array2.length){
             while(i-1<length){
                 if(Integer.valueOf(array1[i])>0){
                     return 1;
                 }
                 i++;
             }
             return 0;
         }else if(array1.length<array2.length){
             while(i-1<length){
                 if(Integer.valueOf(array2[i])>0){
                     return -1;
                 }
                 i++;
             }
             return 0;
         }else{
            return 0;
         }
    }
}