// Last updated: 18/09/2026, 22:29:23
1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0;
4        int mid=0;
5        int high=nums.length-1;
6        while(mid<=high){
7            if(nums[mid]==0){
8                int temp=nums[low];
9                nums[low]=nums[mid];
10                nums[mid]=temp;
11                low++;
12                mid++;
13            }else if(nums[mid]==1){
14                mid++;
15            }else{
16                int temp=nums[mid];
17                nums[mid]=nums[high];
18                nums[high]=temp;
19                high--;
20            }
21        }
22    }
23}