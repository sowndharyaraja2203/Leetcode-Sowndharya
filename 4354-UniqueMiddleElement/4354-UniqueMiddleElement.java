// Last updated: 13/08/2026, 15:05:47
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums[nums.length/2];
        int count=0;
        for(int num:nums){
            if(num==mid){
                count++;
            }
        }
        return count==1;        
    }
}