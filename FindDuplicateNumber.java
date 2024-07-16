class Solution {
    public int findDuplicate(int[] nums) {
        //sort the array
        Arrays.sort(nums);

        //iterate over array
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == nums[i+1]) return nums[i];   //condition of finding the same number
        }
        return -1;   //if not found
    }
}
