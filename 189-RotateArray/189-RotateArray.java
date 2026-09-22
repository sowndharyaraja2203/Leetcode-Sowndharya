// Last updated: 22/09/2026, 22:12:52
1class Solution {
2    public void rotate(int[] nums, int k) {
3       k=k % nums.length;
4       reverse(nums,0,nums.length-1);
5       reverse(nums,0,k-1);
6       reverse(nums,k,nums.length-1);
7    }
8    public void reverse(int[] nums,int left,int right){
9        while(left<right){
10            int temp=nums[left];
11            nums[left]=nums[right];
12            nums[right]=temp;
13        left++;
14        right--;
15        }
16    }
17}
18