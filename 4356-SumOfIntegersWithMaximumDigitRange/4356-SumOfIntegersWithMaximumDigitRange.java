// Last updated: 13/08/2026, 15:05:39
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxrange=-1;
        int sum=0;
        for(int num:nums){
            int temp=Math.abs(num);
            if(temp==0){
                if(maxrange<0){
                    maxrange=0;
                    sum=num;
                }else if(maxrange==0){
                    sum+=num;                    
                }
                continue;
            }
            int mindigit=9;
            int maxdigit=0;
            while(temp>0){
                int digit=temp%10;
                mindigit=Math.min(mindigit,digit);
                maxdigit=Math.max(maxdigit,digit);
                temp/=10;
            }
            int range=maxdigit-mindigit;
            if(range>maxrange){
                maxrange=range;
                sum=num;
            }else if(range==maxrange){
                sum+=num;
            }
        }
        return sum;      
    }
}