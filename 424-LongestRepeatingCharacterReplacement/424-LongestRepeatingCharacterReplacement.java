// Last updated: 13/10/2026, 21:48:15
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] count = new int[26];
4        int left = 0, maxCount = 0, result = 0;        
5        for (int right = 0; right < s.length(); right++) {
6            count[s.charAt(right) - 'A']++;
7            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
8            while ((right - left + 1) - maxCount > k) {
9                count[s.charAt(left) - 'A']--;
10                left++;
11            }            
12            result = Math.max(result, right - left + 1);
13        }        
14        return result;        
15    }
16}