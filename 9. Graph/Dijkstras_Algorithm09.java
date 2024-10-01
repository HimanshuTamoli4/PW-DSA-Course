import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Dijkstras_Algorithm09 {
static int[] dijkstras(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj , int S) {
//prims algo
boolean[] vis = new boolean[V];
int ans[] = new int[V];
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

Arrays.fill(ans, Integer.MAX_VALUE );

ans[S] = 0 ;

pq.add(new int[]{S,0});



while(!pq.isEmpty()){
int[] x = pq.remove();
if(vis[x[0]]==true){
    
continue; 

}

vis[x[0]] = true;


//add connections of x[0] to pq
for( ArrayList<Integer> i :adj.get(x[0])){

int v = i.get(0); //vertex connection   neighbor

int w = i.get(1); //weight
if(ans[x[0]]+ w < ans[v]){
    ans[v] = ans[x[0]]+ w ;
}

pq.add(new int[]{v,ans[v]});


}
}

return ans ;

}


public static void main(String[] args) {
int V = 4; // Number of vertices
ArrayList<ArrayList<ArrayList<Integer>>>
adj = new ArrayList<>();
for (int i = 0; i < V; i++) {
adj.add(new ArrayList<>());
}
// Define the adjacency list with edges and weights

// Edge from vertex 0 to vertex 1 with weights 2

adj.get(0).add(new ArrayList<>());
adj.get(0).get(0).add(1);
adj.get(0).get(0).add(2);

// Edge from vertex 0 to vertex 2 with weights 3

adj.get(0).add(new ArrayList<>());
adj.get(0).get(1).add(2);
adj.get(0).get(1).add(3);

// Edge from vertex 1 to vertex 2 with weights 1

adj.get(1).add(new ArrayList<>());
adj.get(1).get(0).add(2);
adj.get(1).get(0).add(1);

// Edge from vertex 1 to vertex 3 with weights 4

adj.get(1).add(new ArrayList<>());
adj.get(1).get(1).add(3);
adj.get(1).get(1).add(4);

// Edge from vertex 2 to vertex 3 with weights 5

adj.get(2).add(new ArrayList<>());
adj.get(2).get(0).add(3);
adj.get(2).get(0).add(5);

int res[] = dijkstras(V, adj, 0) ;

System.out.println("the array of shortest graph is : " + res);

}
}