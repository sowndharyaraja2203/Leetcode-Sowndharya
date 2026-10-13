// Last updated: 13/10/2026, 15:17:07
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3         int n = temperatures.length;
4        int[] answer = new int[n];
5        Stack<Integer> stack = new Stack<>();
6        for (int i = 0; i < n; i++) {
7            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
8                int prevIndex = stack.pop();
9                answer[prevIndex] = i - prevIndex;
10            }
11            stack.push(i);
12        }
13        return answer;        
14    }
15}