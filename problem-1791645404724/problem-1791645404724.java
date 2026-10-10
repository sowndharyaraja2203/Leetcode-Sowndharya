// Last updated: 10/10/2026, 20:46:44
1class Solution {
2    public int[] maxProductPair(int[] nums, int target) {
3        int maxProduct=Integer.MIN_VALUE;
4        int[] result={-1, -1};
5        for(int i=0;i<nums.length;i++){
6            for(int j=i+1;j<nums.length;j++){
7                if(nums[i]+nums[j]==target && nums[i]!=nums[j]){
8                    int product=nums[i]*nums[j];
9                    if(product>maxProduct){
10                        maxProduct=product;
11                        if(nums[i]>nums[j]){
12                            result[0]=i;
13                            result[1]=j;
14                        }else{
15                            result[0]=j;
16                            result[1]=i;
17                        }
18                    }
19                }
20            }
21        }
22        return result;
23    }
24}