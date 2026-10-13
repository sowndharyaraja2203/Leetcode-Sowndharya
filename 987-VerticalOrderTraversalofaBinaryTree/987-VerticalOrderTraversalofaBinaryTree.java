// Last updated: 13/10/2026, 21:58:38
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> verticalTraversal(TreeNode root) {
18        List<int[]> nodes = new ArrayList<>();
19        dfs(root, 0, 0, nodes);
20        Collections.sort(nodes, (a, b) -> {
21            if (a[0] != b[0]) return a[0] - b[0];
22            if (a[1] != b[1]) return a[1] - b[1];
23            return a[2] - b[2];
24        });        
25        List<List<Integer>> res = new ArrayList<>();
26        int prevCol = Integer.MIN_VALUE;
27        for (int[] n : nodes) {
28            if (n[0] != prevCol) {
29                res.add(new ArrayList<>());
30                prevCol = n[0];
31            }
32            res.get(res.size()-1).add(n[2]);
33        }
34        return res;
35    }    
36    private void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
37        if (node == null) return;
38        nodes.add(new int[]{col, row, node.val});
39        dfs(node.left, row+1, col-1, nodes);
40        dfs(node.right, row+1, col+1, nodes);        
41    }
42}