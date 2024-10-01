import java.util.*;

class DFS_Traversal02 {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
        AL.get(v).add(u);
    }
    // Function to return a list containing the DFS traversal of the graph.
    static ArrayList<Integer> ans = new ArrayList<>();
    public static void dfs(int s , boolean[] vis , ArrayList<ArrayList<Integer>> adj){
        //mark vertex as visited
        vis[s] = true;
        //add vertex to ans list
        ans.add(s);
        //dfs on connections of s
        for(int i : adj.get(s)){
            if(vis[i]==false)
                dfs(i,vis,adj); // call dfs on unvisited connection.
        }
        
    }
    public static   ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        dfs(0,vis,adj);
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
        addEdge(AL,0,2);
        addEdge(AL,0,3);
        addEdge(AL,0,1);
        addEdge(AL,2,4);

        ArrayList<Integer> Result = new ArrayList<>();
        
        Result = dfsOfGraph(V, AL);

        System.out.println(" The dfs taversal of a graph is " + Result );
        
    }
}
