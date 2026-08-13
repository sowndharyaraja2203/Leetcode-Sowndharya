// Last updated: 13/08/2026, 15:06:12
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            int curr=nums[n-1-i];
            long optionAdd=curr;
            long optionMul=(long)curr*mul;
            totalSum+=Math.max(optionAdd,optionMul);
            mul--;
        }
        return totalSum;
    }
}