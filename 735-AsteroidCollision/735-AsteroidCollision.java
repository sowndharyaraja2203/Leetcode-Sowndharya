// Last updated: 13/10/2026, 20:36:58
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>();
4        for (int a : asteroids) {
5            boolean alive = true;
6            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
7                if (stack.peek() < -a) {
8                    stack.pop(); 
9                    continue;
10                } else if (stack.peek() == -a) {
11                    stack.pop(); 
12                }
13                alive = false; 
14            }
15            if (alive) {
16                stack.push(a);
17            }
18        }
19        int[] result = new int[stack.size()];
20        for (int i = result.length - 1; i >= 0; i--) {
21            result[i] = stack.pop();
22        }
23        return result;        
24    }
25}