// Last updated: 13/10/2026, 20:42:54
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Deque<Character> stack = new ArrayDeque<>();        
4        for (char digit : num.toCharArray()) {
5            while (k > 0 && !stack.isEmpty() && stack.peekLast() > digit) {
6                stack.pollLast();
7                k--;
8            }
9            stack.addLast(digit);
10        }
11        while (k > 0 && !stack.isEmpty()) {
12            stack.pollLast();
13            k--;
14        }
15        StringBuilder sb = new StringBuilder();
16        for (char d : stack) sb.append(d);
17        while (sb.length() > 0 && sb.charAt(0) == '0') {
18            sb.deleteCharAt(0);
19        }
20        return sb.length() == 0 ? "0" : sb.toString();        
21    }
22}