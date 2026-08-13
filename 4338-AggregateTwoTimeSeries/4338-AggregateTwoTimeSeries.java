// Last updated: 13/08/2026, 15:06:29
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();
        int i=0,j=0;
        int n=series1.length,m=series2.length;
        while(i<n || j<m){
            int t;
            if(j==m || (i<n && series1[i][0]<series2[j][0])){
                t=series1[i][0];
            }else if(i==n || series2[j][0]<series1[i][0]){
                t=series2[j][0];
            }else{
                t=series1[i][0];
            }
            int v1=0,v2=0;
            if(i<n && series1[i][0]==t){
                v1=series1[i][1];
                i++;
            }else if(i<n){
                v1=series1[i][1];
            }
            if(j<m && series2[j][0]==t){
                v2=series2[j][1];
                j++;
            }else if(j<m){
                v2=series2[j][1];
            }
            ans.add(Arrays.asList(t,v1+v2));
        }
        return ans;        
    }
}