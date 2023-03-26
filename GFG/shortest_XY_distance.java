/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class shortest_XY_distance {
    static int shortestXYDist(ArrayList<ArrayList<Character>> mat, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(mat.get(i).get(j) == 'X'){
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        q.add(new int[]{-1, -1});
        int level = 1;
        while(!q.isEmpty()){
            int x[] = {1, -1, 0, 0};
            int y[] = {0, 0, -1, 1};
            
            int t[] = q.remove();
            
            // level break;
            if(t[0] == -1){
                if(q.isEmpty())
                    return -1;
                q.add(new int[]{-1, -1});
                level++;
                continue;
            }   
            
            System.out.println(t[0]+" "+t[1]);
            if(mat.get(t[0]).get(t[1]) == 'Y')  return level;
            for(int i = 0 ; i < 4 ; i++){
                int u = t[0] + x[i];
                int v = t[1] + y[i];
                
                if(u < 0 || u >= n || v < 0 || v >= m)
                    continue;
                
                if(!visited[u][v]){
                    System.out.println("Added "+u+" "+v);
                    q.add(new int[]{u, v});
                    visited[u][v] = true;
                }
            }
        }
        
        return -1;
    }
}
