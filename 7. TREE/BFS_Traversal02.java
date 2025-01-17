BFS Traversal - Level Order Traversal

Question Link : 
https://practice.geeksforgeeks.org/problems/level-order-traversal/1

Solution Reference : 

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            Node x = q.remove();
            if(x.left!=null)
                q.add(x.left);
            if(x.right!=null)
                q.add(x.right);
            result.add(x.data);
        }
        return result;
    }
}