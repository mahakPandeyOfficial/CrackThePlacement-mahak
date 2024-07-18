public class Solution{
     static int twoSum(int [] nums , int target) {       
         int i = 0;
         int j = i+1;
        while(i<nums.length){
           if((nums[i] + nums[j]) == target){
               return new int[] {i,j};
            }
            i++;
            j++;
        }
        return new int[] {-1,-1};
    }        
}
