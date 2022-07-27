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
public class _2352_equalrowandcolumnpair {
    
    public static void main(String args[]){
        int ar[][] = { {3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2} };
        System.out.println("\n cnt : "+equalPairs(ar));
    }
    
    public static int equalPairs(int[][] grid) {  
        int cnt = 0;
        for(int i = 0 ; i < grid.length ; i++){
            boolean op = true;
            for(int j = 0 ; j < grid.length ; j++){
                op = true;
                for(int k = 0 ; k < grid.length ; k++){
                    if(grid[k][j] != grid[i][k]){
                        op = false;
                        break;
                    }
                }
                if(op)
                    cnt++;    
            }
        }
        return cnt;
    }
}
