import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length ; i++){

            if(nums[i]==0){
                a++;
            }
            else if(a > 0){
                int  temp = nums[i];
                nums[i] = 0;
                nums[i-a] = temp;
            }
        }
    }
}
