// Last updated: 13/10/2026, 21:29:05
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int left = 0, right = 0;
4        for (int w : weights) {
5            left = Math.max(left, w);
6            right += w;               
7        }        
8        while (left < right) {
9            int mid = left + (right - left) / 2;
10            if (canShip(weights, days, mid)) {
11                right = mid; 
12            } else {
13                left = mid + 1; 
14            }
15        }
16        return left;
17    }    
18    private boolean canShip(int[] weights, int days, int capacity) {
19        int d = 1, total = 0;
20        for (int w : weights) {
21            if (total + w > capacity) {
22                d++;
23                total = 0;
24            }
25            total += w;
26        }
27        return d <= days;        
28    }
29}