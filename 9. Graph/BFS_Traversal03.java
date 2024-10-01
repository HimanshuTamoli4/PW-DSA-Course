import java.util.*;

class BFS_Traversal03 {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
        AL.get(v).add(u);
    }
    // Function to return a list containing the BFS traversal of the graph.
    

    public static   ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();

       q.add(0);
       
       while (!q.isEmpty()) 
       {
        int x = q.remove();
        if(vis[x] == false){
            // mark visited 
            vis[x] = true;

            // add to ans list
            ans.add(x);

            // add connection of vertex to queue 
            for(int i : adj.get(x)){
                q.add(i);
            }

        }
        
       }

       return ans;

    }
    
    public static void main(String[] args) {

        int V = 5;
        //create Adjacency List
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);


        for(int i=0 ; i<V ; i++){
            AL.add(new ArrayList<Integer>());
        }


        //Add edges
        addEdge(AL,0,1);
        addEdge(AL,0,2);
        addEdge(AL,0,3);
        addEdge(AL,2,4);

        ArrayList<Integer> Result = new ArrayList<>();
        
        Result = bfsOfGraph(V, AL);

        System.out.println(" The dfs taversal of a graph is " + Result );
        
    }
}
