/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6322 {
    public boolean checkValidGrid(int[][] mat) {
        int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        int n = mat.length;
        int req = 1;
        int _x = 0, _y = 0;
        while( req < n * n){
            int i = 0;
            for(i = 0 ; i < 8 ; i++){
                int a = _x + x[i];
                if(a >= n || a < 0)
                    continue;
                int b = _y + y[i];
                if(b >= n || b < 0)
                    continue;
                
                if(mat[a][b] == req){
                    req++;
                    _x = a;
                    _y = b;
                    break;
                }
            }
               
            if(i == 8)
                return false;
        }
        
        return true;
    }
}
