// Last updated: 13/10/2026, 21:02:05
1class Solution {
2    public boolean search(int[] nums, int target) {
3         for(int i=0;i<nums.length;i++){
4            if(target==nums[i]){
5                return true;
6            }
7        }
8        return false;            
9    }
10}