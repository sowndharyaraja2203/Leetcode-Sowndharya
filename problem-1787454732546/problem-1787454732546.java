// Last updated: 23/08/2026, 08:42:12
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int left=0;
5        int ans=0;
6        for(int right=0;right<nums.length;right++){
7            for(int p:getFactors(nums[right])){
8                map.put(p,map.getOrDefault(p,0)+1);
9            }
10            while(map.size()>k){
11                for(int p:getFactors(nums[left])){
12                    map.put(p,map.get(p)-1);
13                    if(map.get(p)==0){
14                        map.remove(p);
15                    }
16                }
17                left++;
18            }
19            ans=Math.max(ans,right-left+1);
20        }
21        return ans;        
22    }
23    private List<Integer> getFactors(int n){
24        List<Integer> factors=new ArrayList<>();
25        for(int p=2;p*p<=n;p++){
26            if(n%p==0){
27                factors.add(p);
28                while(n%p==0){
29                    n/=p;
30                }
31            }
32        }
33        if(n>1){
34            factors.add(n);
35        }
36        return factors;
37    }
38}