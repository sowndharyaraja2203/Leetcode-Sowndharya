// Last updated: 13/10/2026, 21:30:49
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = (left + right) / 2;
6            if (mid % 2 == 1) mid--; 
7            if (nums[mid] == nums[mid + 1]) {
8                left = mid + 2;
9            } else {
10                right = mid;
11            }
12        }
13        return nums[left];        
14    }
15}