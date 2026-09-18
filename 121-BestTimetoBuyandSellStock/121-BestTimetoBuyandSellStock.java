// Last updated: 18/09/2026, 22:43:14
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice=prices[0];
4        int maxProfit=0;
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]<minPrice){
7                minPrice=prices[i];
8            }else{
9                int profit=prices[i]-minPrice;
10                maxProfit=Math.max(maxProfit,profit);
11            }
12        }
13        return maxProfit;
14    }
15}