// Last updated: 13/10/2026, 20:47:08
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        Arrays.fill(res, -1);
6        Stack<Integer> stack = new Stack<>();        
7        for (int i = 0; i < 2 * n; i++) {
8            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
9                res[stack.pop()] = nums[i % n];
10            }
11            if (i < n) {
12                stack.push(i);
13            }
14        }
15        return res;        
16    }
17}