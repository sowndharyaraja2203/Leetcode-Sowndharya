// Last updated: 20/09/2026, 21:08:43
1class Solution {
2    public int singleNumber(int[] nums) {
3        int res=0;
4        for(int i=0;i<nums.length;i++){
5            res^=nums[i];
6        }
7        return res;
8    }
9}