Validate Binary Search Tree

// time complexity: O(n)
// space complexity: O(n) [Stack Space + ArrayList Data Structure]

class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    public void inOrderTraversal(TreeNode node){
        // left subtree
        if(node.left != null){
            inOrderTraversal(node.left);
        }
        // store the result 
        res.add(node.val);
        // right subtree
        if(node.right != null){
            inOrderTraversal(node.right);
        }
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        inOrderTraversal(root);

        int n = res.size();

        // whether the inorder traversal of a tree stored in the list is sorted or not
        for(int i=0; i<n-1; i++){
            if(res.get(i) >= res.get(i+1)){
                return false;
            }
        }

        return true;
    }
}
-----------------------------------------------------------------------------------------------------------
Lowest Common Ancestor Of BST

// time complexity: O(N)
// space complexity: O(N)

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if(pVal > parentVal && qVal > parentVal){
            // traverse towards the right subtree
            return lowestCommonAncestor(root.right, p, q);
        }

        else if(pVal < parentVal && qVal < parentVal){
            // travese towards the left subtree
            return lowestCommonAncestor(root.left, p, q);
        }

        else{
            return root;
        }
    }
}
----------------------------------------------------------------------------------------------------------
Kth Smallest Element in BST

// time complexity: O(n)
// space complexity: O(n)
class Solution {
    // function definition
    public ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> result){
        if(root == null){
            return result;
        }

        // 1. traverse towards the left side of the node
        inOrderTraversal(root.left, result);
        // 2. store the node value in the result array
        result.add(root.val);
        // 3. traverse towards the right side of the node
        inOrderTraversal(root.right, result);
        return result;
    }

    // Driver code
    public int kthSmallest(TreeNode root, int k) {
        // function calling
        ArrayList<Integer> result = inOrderTraversal(root, new ArrayList<>());
        // return the kth smallest element
        return result.get(k-1);
    }
}
------------------------------------------------------------------------------------------------------------
Insert into a BST

// time complexity: O(n)
// space complexity: O(n)

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        else if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }

        else if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
-------------------------------------------------------------------------------------------------------------
Search in a BST

// time complexity: O(h)
// balanced bst: O(log n)
// skewed bst: O(n)
// space complexity: stack space: O(h)

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // base case condition
        if(root == null || root.val == val){
            return root;
        }

        // left side via recursion
        if(val < root.val){
            // recursive call
            return searchBST(root.left, val);
        }


        // right side via recursion
        else{
            // recursive call
            return searchBST(root.right, val);
        }

    }
}
-------------------------------------------------------------------------------------------------------------
Delete Node in a BST

// time complexity: O(h)
 // space complexity: O(h)
class Solution {
    // method definition of successor
    public int successor(TreeNode root){
        // 1. right side 
        root = root.right;
        // 2. minimum value
        while(root.left != null){
            root = root.left;
        }

        return root.val;
    }

    // method definition of predecessor
    public int predecessor(TreeNode root){
        // 1. left side
        root = root.left;
        // 2. maximum value
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // 1. Search the key in the given tree
        // base case condition
        if(root == null){
            return null;
        }

        // traverse towards the right subtree - recursion
        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }

        // traverse towards the left subtree - recursion
        else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }

        else{
            // case 1: node to be deleted is the leaf node
            if(root.left == null && root.right == null){
                root = null;
            }
            
            // case 2: non-leaf node
            else if(root.right != null){
                // function calling of successor
                // right side - minimum value
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            
            else{
                // function calling of predecssor
                // left side - maximum value
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }

        return root;
    }
}