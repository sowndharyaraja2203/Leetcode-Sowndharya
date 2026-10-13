// Last updated: 13/10/2026, 21:06:12
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int left = 0;
6        int right = m * n - 1;
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            int row = mid / n;
10            int col = mid % n;
11            int midVal = matrix[row][col];
12            if (midVal == target) {
13                return true;
14            } else if (midVal < target) {
15                left = mid + 1;
16            } else {
17                right = mid - 1;
18            }
19        }
20        return false;        
21    }
22}