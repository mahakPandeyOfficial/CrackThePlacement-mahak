class Solution {
    public int rob(int[] nums) {
       //two ppointer track
       int curr = 0, prev = 0;

       for(int num : nums){
        int dummy = curr;

        curr = Math.max(num + prev , curr);

        prev = dummy;
       }
    return curr;
    }
}
