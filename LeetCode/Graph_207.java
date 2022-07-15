/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Vinay Chopda
 */
public class Graph_207 {
    public boolean canFinish(int n, int[][] graph) {
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = new ArrayList<>();
        for(int i = 0 ; i < graph.length ; i++)
            ar[graph[i][0]].add(graph[i][1]);
        
        boolean visited[] = new boolean[n+1];
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < n ; i++)
            if(!visited[i])
                if(!DFS(i, ar, visited, hs))
                    return false;
        return true;
    }
    
    boolean DFS(int start, ArrayList<Integer> ar[], boolean visited[], HashSet<Integer> hs){
        visited[start] = true;
        hs.add(start);
        for(Integer next : ar[start]){
            if(visited[next]){
                if(hs.contains(next))
                    return false;
                continue;
            }
            if(!DFS(next, ar, visited, hs))
                return false;
        }
        hs.remove(start);
        return true;
    }
}


