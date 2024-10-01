// Topolical sorting order is only applocable on directed acyclic(graph which  
// do not have any cycle )  graph .

 
import java.util.*;

class Topological_Sorting_Order06 {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
       
    }
    // Function to return a list containing the DFS traversal of the graph.
    
    public static void  dfs(int s , boolean[] vis ,ArrayList<ArrayList<Integer>> adj , Stack<Integer> st){
        //mark vertex as visited
        vis[s] = true;
       
     
     
        //dfs on connections of s
        for(int i : adj.get(s)){    
            if(vis[i]==false){
                dfs(i , vis,adj , st);  
            }
        }

      st.push(s);
    
    }

    public static  int[] topsort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
          int[] ans = new int[V];
          Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<V ; i++){
            if(vis[i] == false){
           dfs(i, vis, adj , st);
       
            }       
        }
        // pop from stack to ans 
        int i = 0 ;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i++ ;
            
        }
      return ans ;
    }
    
    public static void main(String[] args) {

        int V = 4  ;
        //create Adjacency List
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);


        for(int i=0 ; i<V ; i++){
            AL.add(new ArrayList<Integer>());
        }


        //Add edges
        addEdge(AL,1,0);
        addEdge(AL,2,0);
        addEdge(AL,3,0);
       // addEdge(AL,4,3);

        // int [] Result = new int[V] ;
        // Result = topsort(V, AL);

        System.out.println("The topological order of given graph is " + topsort(V, AL));

        
    }
}
