// Last updated: 13/08/2026, 15:05:41
class Solution {
    public String rearrangeString(String s, char x, char y) {
      StringBuilder first=new StringBuilder();
       StringBuilder middle=new StringBuilder();
        StringBuilder last=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==y)
                first.append(c);
            else if(c==x)
                last.append(c);
            else
                middle.append(c);
                
            }
        return first.toString()+middle.toString()+last.toString();
    }
}