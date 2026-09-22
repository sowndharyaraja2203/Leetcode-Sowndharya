// Last updated: 22/09/2026, 22:07:42
1class Solution {
2    public int missingNumber(int[] nums) {
3        int res=nums.length;
4        for(int i=0;i<nums.length;i++){
5            res=res^i^nums[i];
6        }
7        return res;
8    }
9}