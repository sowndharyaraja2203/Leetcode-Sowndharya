// Last updated: 20/09/2026, 21:08:08
1class Solution {
2    public int singleNumber(int[] nums) {
3        int res=0;
4        for(int num:nums){
5            res^=num;
6        }
7        return res;
8    }
9}