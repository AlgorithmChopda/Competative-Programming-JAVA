/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _1162 {
    public int maxDistance(int[][] mat) {
        // put all the sources (1) in queue
        Queue<int[]>  q = new LinkedList<>();
        int r = mat.length, c = mat[0].length;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(mat[i][j] == 1){
                    q.add(new int[] {i, j});
                }
            }
        }
        
        // do multisource BFS 
        int step = 1;
        while(!q.isEmpty()){
            int cur[] = q.remove();
            boolean flag = false;
            // right
            if(isSafe(cur[0], cur[1]+1, r, c, mat)){
                q.add(new int[] {cur[0], cur[0]+1} );
                flag = true;
            }
            // bottom
            if(isSafe(cur[0]+1, cur[1], r, c, mat)){
                q.add(new int[]{cur[0]+1, cur[1]});
                flag = true;
            }
            if(flag)    step++;
        }
        
        return step;
    }
    
    public static boolean isSafe(int i, int j, int r, int c, int mat[][]){
        if(i >= r || j >= c)    return false;
        if(mat[i][j] == 1 || mat[i][j] == -1)   return false;
        mat[i][j] = -1;
        return true;
    }
}
