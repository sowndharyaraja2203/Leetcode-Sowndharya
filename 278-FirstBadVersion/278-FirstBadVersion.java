// Last updated: 13/10/2026, 20:53:48
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1, right = n;
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9            if (isBadVersion(mid)) {
10                right = mid; 
11            } else {
12                left = mid + 1; 
13            }
14        }
15        return left;
16    }
17}