// Last updated: 13/10/2026, 20:48:58
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] lastIndex = new int[26];
4        boolean[] inStack = new boolean[26];        
5        for (int i = 0; i < s.length(); i++) {
6            lastIndex[s.charAt(i) - 'a'] = i;
7        }        
8        Deque<Character> stack = new ArrayDeque<>();        
9        for (int i = 0; i < s.length(); i++) {
10            char c = s.charAt(i);
11            if (inStack[c - 'a']) continue;            
12            while (!stack.isEmpty() && c < stack.peekLast() && lastIndex[stack.peekLast() - 'a'] > i) {
13                inStack[stack.pollLast() - 'a'] = false;
14            }            
15            stack.addLast(c);
16            inStack[c - 'a'] = true;
17        }        
18        StringBuilder sb = new StringBuilder();
19        for (char c : stack) sb.append(c);
20        return sb.toString();        
21    }
22}