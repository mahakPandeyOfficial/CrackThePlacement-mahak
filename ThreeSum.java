class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sorting
        Arrays.sort(nums); 

        List<List<Integer>> ans = new ArrayList<>();   //2D arraylist
        
        for(int i = 0; i<nums.length ; i++){
            //ignore Duplicates
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            //two pointers 
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else{
                    ans.add(Arrays.asList(nums[i] , nums[left] , nums[right] ));
                    left++;
                    //ignore duplicates
                    while(nums[left] == nums[left-1] && left < right) left++;
                }
            }
        }
        return ans;
    }
}
