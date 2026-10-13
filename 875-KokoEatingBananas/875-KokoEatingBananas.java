// Last updated: 13/10/2026, 21:24:55
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1, right = 0;
4        for (int p : piles) right = Math.max(right, p);        
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (canFinish(piles, h, mid)) {
8                right = mid; 
9            } else {
10                left = mid + 1; 
11            }
12        }
13        return left;
14    }    
15    private boolean canFinish(int[] piles, int h, int speed) {
16        long hours = 0;
17        for (int p : piles) {
18            hours += (p + speed - 1) / speed; 
19            if (hours > h) return false;
20        }
21        return hours <= h;        
22    }
23}