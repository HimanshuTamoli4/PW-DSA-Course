Interview Problems on Trees 2 :

1. Diameter of Tree
Question Link : https://leetcode.com/problems/diameter-of-binary-tree/

Solution Reference :
class Solution {
    int max =  0;
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max( max , left+right );

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
}

2. Max Path Sum
Question Link : https://leetcode.com/problems/binary-tree-maximum-path-sum/

Solution Reference :
class Solution {
    int max = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int left = Math.max(0 , helper(root.left));
        int right = Math.max(0, helper(root.right));
        max = Math.max( max , root.val+left+right );

        return root.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
}