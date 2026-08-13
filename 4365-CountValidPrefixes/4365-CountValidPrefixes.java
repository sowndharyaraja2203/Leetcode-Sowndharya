// Last updated: 13/08/2026, 15:05:29
class Solution {
    public int countValidPrefixes(String s) {
        int zeros=0,ones=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                zeros++;
            }else{
                ones++;
            }
            if(Math.abs(zeros-ones)<=1){
                ans++;
            }
        }
        return ans;        
    }
}