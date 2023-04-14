/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Striver_Sheet;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class array_2_2 {
    public int[][] merge(int[][] in) {
        Arrays.sort(in, (int a[], int b[]) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            
            return a[0] - b[0];
        });
        
        int op[][] = new int[in.length][2];
        int k = 0;
        
        int curLeft = in[0][0], curRight = in[0][1];
        for(int i = 1 ; i < in.length ; i++) {
            if(in[i][0] >= curLeft && in[i][0] <= curRight) {
                // overlapping
                curRight = Math.max(curRight, in[i][1]);
            }
            else{
                op[k][0] = curLeft;
                op[k][1] = curRight;
                k++;
                
                curLeft = in[i][0]; 
                curRight = in[i][1];
            }
        }
        
        op[k][0] = curLeft;
        op[k][1] = curRight;
        return op;
    }
}
