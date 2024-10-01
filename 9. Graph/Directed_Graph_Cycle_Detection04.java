import java.util.*;

class Directed_Graph_Cycle_Detection04 {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
        AL.get(v).add(u);
    }
    // Function to return a list containing the DFS traversal of the graph.
    
    public static boolean dfs(int s ,int p , boolean[] vis , ArrayList<ArrayList<Integer>> adj){
        //mark vertex as visited
        vis[s] = true;
     
        //dfs on connections of s
        for(int i : adj.get(s)){
            if(vis[i]==false){
               if( dfs(i,s, vis,adj) == true){
                return true;
               } 
            }
        else if (vis[i]== true && i!=p) {
            return true ; // ==> cycle  detected 
            
        }
        }
        return false ;
    }

    public static   boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i = 0 ; i<V ; i++){
            if(vis[i] == false){
      if(dfs(i,-1, vis,adj)== true)
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
        addEdge(AL,0,1);
        addEdge(AL,1,2);
        addEdge(AL,2,3);
       // addEdge(AL,3,0);

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
