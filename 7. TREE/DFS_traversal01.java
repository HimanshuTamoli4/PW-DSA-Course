// time complexity = O(n)
// space complexity = O(h)
// ==> where h = height of a tree
// ==> these time and space complexity is same for inorder , preorder and postorder 

//1. Inorder Traversal 



class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return result;
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }
}

//2. Preorder Traversal 

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}

//3. Postorder Traversal 

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return result;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }
}