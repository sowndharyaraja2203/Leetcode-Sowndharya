// Last updated: 14/10/2026, 11:18:09
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) return 0;
4        int prod = 1, count = 0, left = 0;
5        for (int right = 0; right < nums.length; right++) {
6            prod *= nums[right];
7            while (prod >= k) {
8                prod /= nums[left];
9                left++;
10            }
11            count += right - left + 1;
12        }
13        return count;        
14    }
15}