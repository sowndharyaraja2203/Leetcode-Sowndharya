// Last updated: 13/08/2026, 15:05:33
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start=toSeconds(startTime);
        int end=toSeconds(endTime);
        return end-start;
    }
    private int toSeconds(String time){
        String[] t=time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        return h*3600+m*60+s;        
    }
}