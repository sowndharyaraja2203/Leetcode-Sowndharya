// Last updated: 29/08/2026, 21:12:07
1class Solution {
2    public String[] largestString(int[] nums) {
3        String[] ans=new String[nums.length];
4        for(int i=0;i<nums.length;i++){
5            ans[i]=solve(nums[i]);
6        }
7        return ans;
8    }
9    private String solve(int x){
10        StringBuilder sb=new StringBuilder();
11        int zPower = 1 << 25;
12        while(x>=zPower){
13            sb.append('z');
14            x-=zPower;
15        }
16        for(int i=24;i>=0;i--){
17            int power =1 << i;
18            if(x>=power){
19                sb.append((char)('a' + i));
20                x-=power;
21            }
22        }
23        return sb.toString();
24    }
25}