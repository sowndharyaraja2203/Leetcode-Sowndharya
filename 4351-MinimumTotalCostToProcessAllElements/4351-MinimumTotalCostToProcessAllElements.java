// Last updated: 13/08/2026, 15:06:03
class Solution {
    public int minimumCost(int[] nums, int k) {
        long mod=1_000_000_007L;
        long c=k;
        long t=0;
        for(int n:nums){
            if(c<n){
                long d=(long)n-c;
                long o=(d+k-1)/k;
                t+=o;
                c+=(o*(long)k);              
            }
            c-=n;
        }
        long nu=t%mod;
        long np=(t+1)%mod;
        long i=500000004L;
        long r=((nu*np)%mod*i)%mod;
        return (int) r;        
    }
}