// Last updated: 26/09/2026, 21:08:38
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sum1=0;
4        long sum2=0;
5        for(int x:source){
6            sum1+=x;
7        }
8        for(int x:target){
9            sum2+=x;
10        }
11        return sum1==sum2;        
12    }
13}