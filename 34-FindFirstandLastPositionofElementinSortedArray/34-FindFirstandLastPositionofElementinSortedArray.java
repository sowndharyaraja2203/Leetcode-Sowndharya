// Last updated: 13/10/2026, 21:04:59
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        return new int[]{findFirst(nums, target), findLast(nums, target)};
4    }    
5    private int findFirst(int[] nums, int target) {
6        int left = 0, right = nums.length - 1, ans = -1;
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            if (nums[mid] == target) {
10                ans = mid;
11                right = mid - 1; 
12            } else if (nums[mid] < target) {
13                left = mid + 1;
14            } else {
15                right = mid - 1;
16            }
17        }
18        return ans;
19    }
20    private int findLast(int[] nums, int target) {
21        int left = 0, right = nums.length - 1, ans = -1;
22        while (left <= right) {
23            int mid = left + (right - left) / 2;
24            if (nums[mid] == target) {
25                ans = mid;
26                left = mid + 1; 
27            } else if (nums[mid] < target) {
28                left = mid + 1;
29            } else {
30                right = mid - 1;
31            }
32        }
33        return ans;        
34    }
35}