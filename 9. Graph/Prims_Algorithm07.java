import java.util.ArrayList;
import java.util.PriorityQueue;
public class Prims_Algorithm07 {
static int spanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj) {
//prims algo
boolean[] vis = new boolean[V];
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

pq.add(new int[]{0,0});

int cost = 0;

while(!pq.isEmpty()){
int[] x = pq.remove();
if(vis[x[0]]==true){
    
continue; 

}

vis[x[0]] = true;
cost += x[1];

//add connections of x[0] to pq
for( ArrayList<Integer> i :adj.get(x[0])){

int v = i.get(0); //vertex connection   neighbor

int w = i.get(1); //weight
pq.add(new int[]{v,w});
}
}
return cost;


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

int cost = spanningTree(V, adj);

System.out.println("Sum of weights in Minimum Spanning Tree: " + cost);

}
}