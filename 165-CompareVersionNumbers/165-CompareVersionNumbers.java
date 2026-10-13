// Last updated: 13/10/2026, 21:44:57
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");        
5        int n = Math.max(v1.length, v2.length);
6        for (int i = 0; i < n; i++) {
7            int r1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
8            int r2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;            
9            if (r1 < r2) return -1;
10            if (r1 > r2) return 1;
11        }
12        return 0;        
13    }
14}