class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        //greedy approach or sliding window approach
        int i = 0;
        int j = m-1;
        Collections.sort(a);   //sort the arraylist
        
        long ans = Long.MAX_VALUE;
        
        while(j<n){
            ans = Math.min(ans, a.get(j) - a.get(i));
            i++;
            j++;
        }
        return ans;
    }
}
