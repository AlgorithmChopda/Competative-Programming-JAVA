/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _6330 {    
    int DFS(ArrayList<Integer> g[], int node, boolean v[]) {
        v[node] = true;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        q.add(-1);
        
        int len = 1;
        int target = node;
        
        while(!q.isEmpty()) {
            int t = q.remove();
            if(t == -1){
                if(q.isEmpty()){
                    return Integer.MAX_VALUE;
                }
                len++;
                q.add(-1);
            }
            
            for(int i : g[t]) {
                if(i == target){
                    return len + 1; 
                }
                if(!v[i]){
                    q.add(i);
                }
            }
        }
        
        return Integer.MAX_VALUE;
    }
    
    
    public int findShortestCycle(int n, int[][] e) {
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++){
            ar[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < e.length ; i++){
            ar[e[i][0]].add(e[i][1]);
            ar[e[i][1]].add(e[i][0]);
        }
            
        boolean v[];
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
           v = new boolean[n];
           min = Math.min(min, DFS(ar, i, v));
        }
        
        if(min == Integer.MAX_VALUE)
            return -1;
       
        return min;
    }
}
