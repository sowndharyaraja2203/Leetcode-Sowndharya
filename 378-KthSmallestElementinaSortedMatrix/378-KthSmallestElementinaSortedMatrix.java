// Last updated: 13/10/2026, 21:32:38
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int left = matrix[0][0], right = matrix[n-1][n-1];        
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (countLessEqual(matrix, mid) < k) {
8                left = mid + 1;
9            } else {
10                right = mid;
11            }
12        }
13        return left;
14    }    
15    private int countLessEqual(int[][] matrix, int x) {
16        int n = matrix.length;
17        int count = 0, col = n - 1;
18        for (int row = 0; row < n; row++) {
19            while (col >= 0 && matrix[row][col] > x) {
20                col--;
21            }
22            count += (col + 1);
23        }
24        return count;        
25    }
26}