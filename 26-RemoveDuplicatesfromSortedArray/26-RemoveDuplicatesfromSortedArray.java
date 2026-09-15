// Last updated: 15/09/2026, 20:25:27
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j=0;
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]!=nums[j]){
6                j++;
7                nums[j]=nums[i];
8            }
9        }
10        return j+1;
11    }
12}