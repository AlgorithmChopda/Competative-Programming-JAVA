/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class Topological_Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Enter the No of Edges : ");
        int edges = sc.nextInt();
        
        ArrayList<Integer> ar[] = new ArrayList[edges];
        for(int i = 0 ; i < edges ; i++)
            ar[i] = (new ArrayList<>());
        
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar[u].add(v);
        }
        
        boolean visited[] = new boolean[edges];
        ArrayList<Integer> op = new ArrayList<>();
        for(int i = 0 ; i < edges ; i++)
            if(!visited[i])
                TopologicalSort(i, ar, visited, op);
        System.out.println("\n"+op);
    }

    public static void TopologicalSort(int start, ArrayList<Integer>[] ar, boolean visited[], ArrayList<Integer> op){
        // assuming it's a Directed Graph
        visited[start] = true;
        for(Integer next : ar[start])
            if(!visited[next])
                TopologicalSort(next, ar, visited, op);
        op.add(start);
    }
    
    
    // Topological sort using Kahn algorithm (BFS)
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edge, int n) 
    {
        ArrayList<Integer> ar[] = new ArrayList[n];
        
        for(int i = 0 ; i < n ; i++) {
            ar[i] = new ArrayList<>();
        }
        
        // building graph
        int cnt[] = new int[n];
        for(int i = 0; i < edge.size() ; i++) {
            ar[edge.get(i).get(0)].add(edge.get(i).get(1));
            cnt[edge.get(i).get(1)]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        // adding nodes with indegree 0
        for(int i = 0 ; i < n ; i++) {
            if(cnt[i] == 0) {
                q.add(i);
            }    
        }
        
        // int op[] = new int[n];
        // int index = 0;
        
        ArrayList<Integer> op = new ArrayList<>();
        
        // Topological sort
        while(!q.isEmpty()) {
            int node = q.remove();
            // op[index++] = node;
            op.add(node);
            
            for(int nei : ar[node]) {
                cnt[nei]--;
                if(cnt[nei] == 0) {
                    q.add(nei);
                }
            }
        }
        
        return op;
    }
    
    
    
    
    
    
}
