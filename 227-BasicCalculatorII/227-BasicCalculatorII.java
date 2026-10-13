// Last updated: 13/10/2026, 20:38:47
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int num = 0;
5        char op = '+';        
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);            
8            if (Character.isDigit(ch)) {
9                num = num * 10 + (ch - '0');
10            }            
11            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
12                if (op == '+') {
13                    stack.push(num);
14                } else if (op == '-') {
15                    stack.push(-num);
16                } else if (op == '*') {
17                    stack.push(stack.pop() * num);
18                } else if (op == '/') {
19                    int prev = stack.pop();
20                    stack.push(prev / num); 
21                }
22                op = ch;
23                num = 0;
24            }
25        }        
26        int result = 0;
27        for (int n : stack) result += n;
28        return result;        
29    }
30}