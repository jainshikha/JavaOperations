public class DijkstraShortestPathProblem {
  static final int V = 9;

  // calculate the shortest path
  public static void graphCalculation() {}

  public static void main(String[] args) {
    //
    /* Let us create the example graph discussed above */
    int[][] graph =
        new int[][] {
          // {0, 1, 2, 3, 4, 5, 6, 7, 8},
          {0, 4, 0, 0, 0, 0, 0, 8, 0}, // 0
          {4, 0, 8, 0, 0, 0, 0, 11, 0}, // 1
          {0, 8, 0, 7, 0, 4, 0, 0, 2}, // 2
          {0, 0, 7, 0, 9, 14, 0, 0, 0}, // 3
          {0, 0, 0, 9, 0, 10, 0, 0, 0}, // 4
          {0, 0, 4, 14, 10, 0, 2, 0, 0}, // 5
          {0, 0, 0, 0, 0, 2, 0, 1, 6}, // 6
          {8, 11, 0, 0, 0, 0, 1, 0, 7}, // 7
          {0, 0, 2, 0, 0, 0, 6, 7, 0} // 8
        };
    DijkstraShortestPathProblem t = new DijkstraShortestPathProblem();
    t.dijkstra(graph, 0);
  }

  public void dijkstra(int[][] graph, int src) {
    int[] dist = new int[V];

    // init with infinite for all edges
    Boolean[] sptSet = new Boolean[V];
    for (int i = 0; i < V; i++) {
      dist[i] = Integer.MAX_VALUE;
      sptSet[i] = false;
    }
    // Distance of source vertex from itself is always 0
    dist[src] = 0;

    // Find shortest path for all vertices
    for (int count = 0; count < V - 1; count++) {
      int u = minDistance(dist, sptSet);

      // Mark the picked vertex as processed
      sptSet[u] = true;
      for (int v = 0; v < V; v++) {
        // Update dist[v] only if is not in sptSet, there is an
        // edge from u to v, and total weight of path from src to
        // v through u is smaller than current value of dist[v]
        if (!sptSet[v]
            && graph[u][v] != 0
            && dist[u] != Integer.MAX_VALUE
            && dist[u] + graph[u][v] < dist[v]) {
          dist[v] = dist[u] + graph[u][v];
        }
      }
    }
    printSolution(dist, V);
  }

  public void printSolution(int[] dist, int n) {
    System.out.println("Vertex   Distance from Source");
    for (int i = 0; i < V; i++) System.out.println(i + " tt " + dist[i]);
  }

  public int minDistance(int[] dist, Boolean[] sptSet) {
    // Initialize min value
    int min = Integer.MAX_VALUE, min_index = -1;

    for (int v = 0; v < V; v++) {
      System.out.println("dist[v] "+dist[v]);
      if (sptSet[v] == false && dist[v] <= min) {
        min = dist[v];
        min_index = v;
      }
}
    return min_index;
  }
}
