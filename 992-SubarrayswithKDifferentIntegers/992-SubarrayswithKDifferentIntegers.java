// Last updated: 13/10/2026, 20:40:14
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMostK(nums, k) - atMostK(nums, k - 1);
4    }    
5    private int atMostK(int[] nums, int k) {
6        Map<Integer, Integer> count = new HashMap<>();
7        int left = 0, res = 0, distinct = 0;        
8        for (int right = 0; right < nums.length; right++) {
9            count.put(nums[right], count.getOrDefault(nums[right], 0) + 1);
10            if (count.get(nums[right]) == 1) distinct++;            
11            while (distinct > k) {
12                count.put(nums[left], count.get(nums[left]) - 1);
13                if (count.get(nums[left]) == 0) distinct--;
14                left++;
15            }            
16            res += right - left + 1;
17        }
18        return res;        
19    }
20}