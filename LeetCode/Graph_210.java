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
public class Graph_210 {
     public int[] findOrder(int n, int[][] graph) {
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = new ArrayList<>();
        for(int i = 0 ; i < graph.length ; i++)
            ar[graph[i][0]].add(graph[i][1]);
        
        int temp[] = new int[n];
        
        boolean visited[] = new boolean[n+1];   // if node is visited or not
        HashSet<Integer> hs = new HashSet<>();  // if node is in current recursion
        ArrayList<Integer> op = new ArrayList<>();  // output arraylist(not int[]);
        
        for(int i = 0 ; i < n ; i++)
            if(!visited[i])
                if(!DFS(i, ar, visited, hs, op))
                    return new int[0];
        
        for(int i = 0 ; i < op.size() ; i++)
            temp[i] = op.get(i);
        
        return temp;        
    }
    
    boolean DFS(int start, ArrayList<Integer> ar[], boolean visited[], HashSet<Integer> hs, ArrayList<Integer> op){
        visited[start] = true;
        hs.add(start);
        for(Integer next : ar[start]){
            if(visited[next]){
                if(hs.contains(next))
                    return false;
                continue;
            }
            if(!DFS(next, ar, visited, hs, op))
                return false;
        }
        hs.remove(start);
        op.add(start);
        return true;
    }
}
