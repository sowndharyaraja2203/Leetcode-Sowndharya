// Last updated: 13/10/2026, 21:56:02
1class Solution {
2    public int totalFruit(int[] fruits) {
3        Map<Integer, Integer> count = new HashMap<>();
4        int left = 0, res = 0;        
5        for (int right = 0; right < fruits.length; right++) {
6            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);            
7            while (count.size() > 2) {
8                count.put(fruits[left], count.get(fruits[left]) - 1);
9                if (count.get(fruits[left]) == 0) {
10                    count.remove(fruits[left]);
11                }
12                left++;
13            }            
14            res = Math.max(res, right - left + 1);
15        }        
16        return res;        
17    }
18}