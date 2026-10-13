// Last updated: 13/10/2026, 21:54:08
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0, sum = 0, res = Integer.MAX_VALUE;        
4        for (int right = 0; right < nums.length; right++) {
5            sum += nums[right];
6            while (sum >= target) {
7                res = Math.min(res, right - left + 1);
8                sum -= nums[left++];
9            }
10        }
11        return res == Integer.MAX_VALUE ? 0 : res;        
12    }
13}