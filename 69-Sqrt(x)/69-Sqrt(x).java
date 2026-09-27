// Last updated: 27/09/2026, 22:01:51
1class Solution {
2    public int mySqrt(int x) {
3        if(x<2){
4            return x;
5        }
6        int left=1;
7        int right=x/2;
8        int ans=1;
9        while(left<=right){
10            int mid=left+(right-left)/2;
11            if(mid<=x/mid){
12                ans=mid;
13                left=mid+1;
14            }else{
15                right=mid-1;
16            }
17        }
18        return ans;
19    }
20}
21