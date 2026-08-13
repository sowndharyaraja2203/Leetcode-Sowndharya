// Last updated: 13/08/2026, 15:06:25
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int maxLeft=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            maxLeft=Math.max(maxLeft,nums[j-k]);
            ans=Math.max(ans,maxLeft+nums[j]);
        }
        return ans;        
    }
}