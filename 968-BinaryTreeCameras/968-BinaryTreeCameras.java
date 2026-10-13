// Last updated: 13/10/2026, 21:41:37
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
17    private int cameras = 0;
18    public int minCameraCover(TreeNode root) {
19        if (dfs(root) == 2) cameras++;
20        return cameras;
21    }    
22    private int dfs(TreeNode node) {
23        if (node == null) return 1;
24        int left = dfs(node.left);
25        int right = dfs(node.right);        
26        if (left == 2 || right == 2) {
27            cameras++;
28            return 0; 
29        }
30        if (left == 0 || right == 0) {
31            return 1; 
32        }
33        return 2;        
34    }
35}