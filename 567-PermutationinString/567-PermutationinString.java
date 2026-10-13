// Last updated: 13/10/2026, 21:52:11
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int len1 = s1.length(), len2 = s2.length();
4        if (len1 > len2) return false;        
5        int[] count1 = new int[26];
6        int[] window = new int[26];        
7        for (char c : s1.toCharArray()) {
8            count1[c - 'a']++;
9        }        
10        for (int i = 0; i < s2.length(); i++) {
11            window[s2.charAt(i) - 'a']++;
12            if (i >= len1) {
13                window[s2.charAt(i - len1) - 'a']--;
14            }            
15            if (Arrays.equals(window, count1)) {
16                return true;
17            }
18        }
19        return false;        
20    }
21}