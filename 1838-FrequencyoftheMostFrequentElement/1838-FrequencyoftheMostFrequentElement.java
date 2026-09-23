// Last updated: 23/09/2026, 19:36:59
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4        long sum=0;
5        int left=0;
6        int maxFreq=1;
7        for(int  right=0;right<nums.length;right++){
8            sum+=nums[right];
9            while((long) nums[right]*(right-left+1)-sum>k){
10                sum-=nums[left];
11                left++;
12            }
13            maxFreq=Math.max(maxFreq,right-left+1);
14        }
15        return maxFreq;
16    }
17}
18
19