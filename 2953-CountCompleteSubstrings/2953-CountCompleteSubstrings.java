// Last updated: 13/10/2026, 21:00:48
1class Solution {
2    public int countCompleteSubstrings(String word, int k) {
3        int n = word.length();
4        int ans = 0;
5        int start = 0;        
6        for (int i = 1; i <= n; i++) {
7            if (i == n || Math.abs(word.charAt(i) - word.charAt(i-1)) > 2) {
8                ans += countInSegment(word.substring(start, i), k);
9                start = i;
10            }
11        }
12        return ans;
13    }    
14    private int countInSegment(String seg, int k) {
15        int res = 0, m = seg.length();
16        for (int len = k; len <= Math.min(m, 26 * k); len += k) {
17            int[] freq = new int[26];
18            int left = 0;
19            for (int right = 0; right < m; right++) {
20                freq[seg.charAt(right) - 'a']++;
21                if (right - left + 1 > len) {
22                    freq[seg.charAt(left) - 'a']--;
23                    left++;
24                }
25                if (right - left + 1 == len) {
26                    if (isValid(freq, k)) res++;
27                }
28            }
29        }
30        return res;
31    }    
32    private boolean isValid(int[] freq, int k) {
33        for (int f : freq) {
34            if (f != 0 && f != k) return false;
35        }
36        return true;  
37    }
38}