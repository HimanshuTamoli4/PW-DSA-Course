import java.util.*;

class Undireccted_cycle05 {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
       
    }
    // Function to return a list containing the DFS traversal of the graph.
    
    public static boolean dfs(int x , boolean[] vis , boolean[] dfsv , ArrayList<ArrayList<Integer>> adj){
        //mark vertex as visited
        vis[x] = true;
        dfsv[x] = true;
     
     
        //dfs on connections of s
        for(int i : adj.get(x)){
            if(vis[i]==false){
               if( dfs(i , vis, dfsv ,adj) == true){
                return true;
               } 
            }
        else if (dfsv[i]== true ) {
            return true ; // ==> cycle  detected 
            
        }
        }
        dfsv[x] = false;
        return false ;
    }

    public static  boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
         boolean[] dfsv = new boolean[V];

        for(int i = 0 ; i<V ; i++){
            if(vis[i] == false){
      if(dfs(i, vis, dfsv ,adj)== true)
        return true;
            }    
             
        }
      return false ;
    }
    
    public static void main(String[] args) {

        int V = 5  ;
        //create Adjacency List
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);


        for(int i=0 ; i<V ; i++){
            AL.add(new ArrayList<Integer>());
        }


        //Add edges
        addEdge(AL,1,2);
        addEdge(AL,1,4);
        addEdge(AL,2,3);
        addEdge(AL,4,3);

        boolean Result ;
        
        Result = isCycle(V, AL);

       if(Result == true){
        System.out.println("Graph contains a cycle ");
       }
       else{
        System.out.println("Graph do not contains any cycle ");
       }
        
    }
}
