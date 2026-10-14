// Last updated: 14/10/2026, 11:15:06
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        Map<Integer, Integer> prefixMap = new HashMap<>();
4        prefixMap.put(0, 1); 
5        int prefixSum = 0, count = 0;
6        for (int num : nums) {
7            prefixSum += num;
8            if (prefixMap.containsKey(prefixSum - goal)) {
9                count += prefixMap.get(prefixSum - goal);
10            }
11            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
12        }
13        return count;        
14    }
15}