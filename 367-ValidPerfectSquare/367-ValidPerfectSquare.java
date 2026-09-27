// Last updated: 27/09/2026, 22:33:19
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int left=1;
4        int right=num;
5        while(left<=right){
6            int mid=left+(right-left)/2;
7            if(mid==num/mid&& num%mid==0){
8                return true;
9            }else if(mid<num/mid){
10                left=mid+1;
11            }else{
12                right=mid-1;
13            }
14        }
15        return false;
16    }
17}