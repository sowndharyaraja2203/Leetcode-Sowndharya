// Last updated: 21/09/2026, 21:27:37
1class Solution {
2    public int reverse(int x) {
3        int res=0;
4        while(x!=0){
5            int digit=x%10;
6            x=x/10;
7            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10){
8                return 0;
9            }
10            res=res*10+digit;
11        }
12        return res;
13    }
14}
15       