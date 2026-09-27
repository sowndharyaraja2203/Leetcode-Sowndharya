// Last updated: 27/09/2026, 21:31:37
1class Solution {
2    public int countOdds(int low, int high) {
3        int count=(high-low)/2;
4        if(low%2!=0 ||high%2!=0){
5            count++;
6        }       
7    return count;
8    }
9}