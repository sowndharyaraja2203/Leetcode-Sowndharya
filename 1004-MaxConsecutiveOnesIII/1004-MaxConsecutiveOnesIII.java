// Last updated: 16/09/2026, 21:27:19
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left=0;
4        int zeros=0;
5        int maxLength=0;
6        for(int right=0;right<nums.length;right++){
7            if(nums[right]==0){
8                zeros++;
9            }
10            while(zeros>k){
11                if(nums[left]==0){
12                    zeros--;
13                }
14                left++;
15            }
16            maxLength=Math.max(maxLength,right-left+1);
17        }
18        return maxLength;        
19    }
20}