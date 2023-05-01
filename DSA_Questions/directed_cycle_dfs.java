/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class directed_cycle_dfs {
    static class Graph {
     
    private final int V;
    private final List<List<Integer>> adj;
 
    public Graph(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);
         
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
    }
     
    // Function to check if cycle exists
    private boolean isCyclicUtil(int i, boolean[] visited,
                                      boolean[] recStack)
    {
         
        System.out.println(i);
        // Mark the current node as visited and
        // part of recursion stack
        if (recStack[i])
            return true;
 
        if (visited[i])
            return false;
             
        visited[i] = true;
 
        recStack[i] = true;
        List<Integer> children = adj.get(i);
         
        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;
                 
        recStack[i] = false;
 
        return false;
    }
 
    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }
 
    // Returns true if the graph contains a
    // cycle, else false.
    private boolean isCyclic()
    {      
        // Mark all the vertices as not visited and
        // not part of recursion stack
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
              
        // Call the recursive helper function to
        // detect cycle in different DFS trees
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;
 
        return false;
    }
 
    // Driver code
    
}
    
    public static void main(String[] args)
    {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);        
         
        // Function call
        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle");
    }
}
