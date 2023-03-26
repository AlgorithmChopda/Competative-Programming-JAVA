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
public class _1129 {
    public int[] shortestAlternatingPaths(int n, int[][] red, int[][] blue) {
        // 0 - red 1 - blue
        ArrayList<int []> ar[] = new ArrayList[n];

        // building graph
        for(int i = 0 ; i < red.length ; i++){
            ar[red[i][0]].add(new int[] {red[i][1], 0} );
        }

        for(int i = 0 ; i < blue.length ; i++){
            ar[blue[i][0]].add( new int[] {blue[i][1], 1} );
        }

        for(ArrayList<int []> i : ar){
            for(int[] j : i){
                
            }
        }
        
        return new int[1];
    }
}
