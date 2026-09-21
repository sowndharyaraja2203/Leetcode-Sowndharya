// Last updated: 21/09/2026, 21:29:47
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] res=new int[2*n];
4        int index=0;
5        for(int i=0;i<n;i++){
6            res[index]=nums[i];
7            index++;
8            res[index]=nums[i+n];
9            index++;
10        } 
11        return res;       
12    }
13}