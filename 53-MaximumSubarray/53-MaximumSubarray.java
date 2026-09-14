// Last updated: 14/09/2026, 19:30:30
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curSum=nums[0];
4        int maxSum=nums[0];
5        for(int i=1;i<nums.length;i++){
6            curSum=Math.max(nums[i],curSum+nums[i]);
7            maxSum=Math.max(maxSum,curSum);
8        } 
9        return maxSum;     
10    }
11}