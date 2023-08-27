/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;

/**
 *
 * @author Vinay Jain
 */
public class _547 {
    public int findCircleNum(int[][] mat) {
        int n = mat.length;
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++) {
            ar[i] = new ArrayList<>();
            for(int j = 0 ; j < n ; j++) {
                if(mat[i][j] == 1) {
                    ar[i].add(j);
                } 
            }
        }
        
        boolean v[] = new boolean[n];
        int cnt = 0;
        for(int i = 0 ; i < n ; i++) {
            if(!v[i]) {
                cnt++;
                DFS(i, ar, v);    
            }
        }
        
        return cnt;
    }
    
    void DFS(int node, ArrayList<Integer> ar[], boolean v[]) {
        v[node] = true;
        for(int nei : ar[node]) if(!v[nei]) DFS(nei, ar, v);
    }
}
