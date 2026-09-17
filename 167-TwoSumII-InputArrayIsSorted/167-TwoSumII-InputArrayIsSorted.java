// Last updated: 17/09/2026, 21:32:42
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left=0;
4        int right=numbers.length-1;
5        while(left<right){
6            int sum=numbers[left]+numbers[right];
7            if(sum==target){
8                return new int[]{left+1,right+1};
9            }else if(sum<target){
10                left++;
11            }else{
12                right--;
13            }
14        }
15        return new int[]{};
16    }
17}