// Last updated: 13/10/2026, 21:50:18
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> res = new ArrayList<>();
4        int[] countP = new int[26];
5        int[] window = new int[26];        
6        for (char c : p.toCharArray()) {
7            countP[c - 'a']++;
8        }        
9        int lenP = p.length();
10        for (int i = 0; i < s.length(); i++) {
11            window[s.charAt(i) - 'a']++;            
12            if (i >= lenP) {
13                window[s.charAt(i - lenP) - 'a']--;
14            }            
15            if (Arrays.equals(window, countP)) {
16                res.add(i - lenP + 1);
17            }
18        }
19        return res;        
20    }
21}