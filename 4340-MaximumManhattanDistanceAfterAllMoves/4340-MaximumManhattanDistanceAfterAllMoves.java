// Last updated: 13/08/2026, 15:06:27
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0;
        int que=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                y++;
            }else if(c=='D'){
                y--;
            }else if(c=='L'){
                x--;                
            }else if(c=='R'){
                x++;
            }else{
                que++;
            }
        }
        return Math.abs(x)+Math.abs(y)+que;        
    }
}