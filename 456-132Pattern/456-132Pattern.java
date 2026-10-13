// Last updated: 13/10/2026, 20:50:39
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> stack = new Stack<>();
4        int third = Integer.MIN_VALUE;      
5        for (int i = nums.length - 1; i >= 0; i--) {
6            if (nums[i] < third) return true;
7            while (!stack.isEmpty() && nums[i] > stack.peek()) {
8                third = stack.pop();
9            }
10            stack.push(nums[i]);
11        }
12        return false;        
13    }
14}