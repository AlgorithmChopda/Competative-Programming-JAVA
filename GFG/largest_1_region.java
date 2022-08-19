/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class largest_1_region {
    
    class Solution
    {
        int x[] = {-1, -1, -1, 0, 1, 1,  1,  0};
        int y[] = {-1,  0,  1, 1, 1, 0, -1, -1};
        
        public int helper(int ar[][], int dp[][], int r, int c, int Row, int Col){
            dp[r][c] = 0;
            int count = 0;
            for(int i = 0 ; i < 8 ; i++){
                int new_r = r + x[i];
                int new_c = c + y[i];
                
                if(isSafe(new_r, new_c, Row, Col)){
                    if(ar[new_r][new_c] != 0 && dp[new_r][new_c] != -1){
                        int val = helper(ar, dp, new_r, new_c, Row, Col);
                        dp[new_r][new_c] = val;
                        count += val;
                    }
                }
            }
            
            dp[r][c] = count+1;
            return count+1;
        }
        
        public boolean isSafe(int r, int c, int Row, int Col) {
            if(r >= Row || r < 0 || c >= Col || c < 0)
                return false;
            return true;
        }
        
        public int findMaxArea(int[][] ar)
        {
            int Row = ar.length, Col = ar[0].length;
            int dp[][] = new int[Row][Col];
            
            for(int i = 0 ; i < Row ; i++)
                Arrays.fill(dp[i], -1);
            
            int length = 0;
            for(int i = 0 ; i < Row; i++)
                for(int j = 0 ; j < Col ; j++)
                    if(dp[i][j] == -1)
                        length = Math.max(helper(ar, dp, i, j, Row, Col), length);

            for(int i = 0 ; i < Row; i++){
                for(int j = 0 ; j < Col ; j++)
                    System.out.print(dp[i][j]+" ");
                System.out.println();
            }
            return length;    
            
        }
    }
    
    public static void main(String args[]){

    }
    
}
