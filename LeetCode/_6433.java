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
public class _6433 {
    public int getMax(int i, int j, int dp[][], int r, int c, int mat[][], int cur_i, int cur_j) {
        if(i >= 0 && i < r && j >= 0 && j < c && mat[cur_i][cur_j] < mat[i][j]) {
            return dp[i][j] + 1;
        }
        return 0;
    }
    public int maxMoves(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        int dp[][] = new int[r][c];
        
        for(int j = c - 1 ; j >= 0 ; j--) {
            for(int i = r - 1 ; i >= 0 ; i--) {
                dp[i][j] = getMax(i-1, j+1, dp, r, c, mat, i, j);
                dp[i][j] = Math.max(dp[i][j], getMax(i, j+1, dp, r, c, mat, i, j));
                dp[i][j] = Math.max(dp[i][j], getMax(i+1, j+1, dp, r, c, mat, i, j));
            }
        }
        
        int ans = 0 ;
        for(int i = 0 ; i < r ; i++) {
            ans = Math.max(dp[i][0], ans);
        }
        
        return ans;
    }
}
