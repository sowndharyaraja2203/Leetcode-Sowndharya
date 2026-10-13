// Last updated: 13/10/2026, 21:08:22
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
17    private int maxSum; 
18    public int maxPathSum(TreeNode root) {  
19        maxSum = Integer.MIN_VALUE;
20        dfs(root);
21        return maxSum;
22    }
23    private int dfs(TreeNode node) {
24        if (node == null) return 0;        
25        int left = Math.max(dfs(node.left), 0);
26        int right = Math.max(dfs(node.right), 0);
27        maxSum = Math.max(maxSum, node.val + left + right);
28        return node.val + Math.max(left, right);        
29    }
30}