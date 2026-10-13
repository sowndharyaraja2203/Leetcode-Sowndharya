// Last updated: 13/10/2026, 21:46:47
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        for (long a = 0; a * a <= c; a++) {
4            long b2 = c - a * a;
5            long b = (long) Math.sqrt(b2);
6            if (b * b == b2) return true;
7        }
8        return false;        
9    }
10}