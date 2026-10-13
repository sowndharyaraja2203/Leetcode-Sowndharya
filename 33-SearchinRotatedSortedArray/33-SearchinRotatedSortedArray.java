// Last updated: 13/10/2026, 20:56:12
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;        
4        while (left <= right) {
5            int mid = left + (right - left) / 2;            
6            if (nums[mid] == target) return mid;
7            if (nums[left] <= nums[mid]) {
8                if (nums[left] <= target && target < nums[mid]) {
9                    right = mid - 1;
10                } else {
11                    left = mid + 1;
12                }
13            } else { 
14                if (nums[mid] < target && target <= nums[right]) {
15                    left = mid + 1;
16                } else {
17                    right = mid - 1;
18                }
19            }
20        }        
21        return -1;        
22    }
23}