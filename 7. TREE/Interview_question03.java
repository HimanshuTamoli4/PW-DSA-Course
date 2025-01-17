Interview Problems on Trees 1 :

1. Height of the tree - Maximum Depth of Tree 
Question Link : 
https://leetcode.com/problems/maximum-depth-of-binary-tree/

Solution Reference :
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}

2. Symmetric tree 
Question Link : https://leetcode.com/problems/symmetric-tree/

Solution Reference :
class Solution {
    public boolean check(TreeNode left , TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.val!=right.val)
            return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}

3. Level Order Traversal 
Question Link : https://leetcode.com/problems/binary-tree-level-order-traversal/

Solution Reference :
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0 ; i<count ; i++){
                TreeNode x = q.remove();
                level.add(x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            result.add(level);
        }
        return result;
    }
}