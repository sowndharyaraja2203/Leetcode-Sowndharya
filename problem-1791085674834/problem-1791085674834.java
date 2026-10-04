// Last updated: 04/10/2026, 09:17:54
1class Solution {
2    public int minRotations(String s) {
3        int curr=0;
4        int tot=0;
5        for(int i=0;i<s.length();i++){
6            int next=s.charAt(i)-'0';
7            int diff=Math.abs(curr-next);
8            int rotations=Math.min(diff,10-diff);
9            tot+=rotations;
10            curr=next;
11        }
12        return tot;
13    }
14}