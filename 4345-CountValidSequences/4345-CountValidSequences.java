// Last updated: 13/08/2026, 15:06:16
class Solution {
    static final int MOD=1000000007;
    public int countValidSequences(int n, int k) {
        if(k>n) return 0;
        long tot=nCr(n-1,k-1);
        long odd=0;
        if((n-k)>=0 &&(n-k)%2==0){
            int m=(n-k)/2;
            odd=nCr(m+k-1,k-1);
        }
        return (int)((tot-odd+MOD)%MOD);
    }
    private long nCr(int n,int r){
        if(r<0 || r>n) return 0;
        long[] fact=new long[n+1];
        long[] invfact=new long[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++)
            fact[i]=fact[i-1]*i%MOD;
        invfact[n]=power(fact[n],MOD-2);
        for(int i=n-1;i>=0;i--)
            invfact[i]=invfact[i+1]*(i+1)%MOD;
        return fact[n]*invfact[r]%MOD*invfact[n-r]%MOD;
    }
    private long power(long a,long b){
        long res=1;
        while(b>0){
        if((b&1)==1)
            res=res*a%MOD;
        a=a*a%MOD;
        b>>=1;
        }
        return res;
    }
}