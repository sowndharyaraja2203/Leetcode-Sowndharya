// Last updated: 20/09/2026, 21:27:47
1class Solution {
2    public int maxArea(int[] height) {
3         int left=0;
4         int right=height.length-1;
5         int maxArea=0;
6         while(left<right){
7            int width=right-left;
8            int h=Math.min(height[left],height[right]);
9            int area=width*h;
10            maxArea=Math.max(maxArea,area);
11            if(height[left]<height[right]){
12                left++;
13            }else{
14                right--;
15            }
16        }
17        return maxArea;
18    }
19}
20
21