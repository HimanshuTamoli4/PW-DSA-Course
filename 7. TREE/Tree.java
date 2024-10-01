class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public Integer val;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    TreeNode root;

    public Tree(int rootData) {
        root = new TreeNode(rootData);
    }

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        }
}
