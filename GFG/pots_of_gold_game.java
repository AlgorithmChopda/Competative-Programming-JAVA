/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

/**
 *
 * @author Vinay Jain
 */
public class pots_of_gold_game {
    
    class GfG
    {
        
	public int maxCoins(int ar[],int n)
	{
            int dp[][] = new int[n+1][n+1];
            
            for(int len = 1 ; len <= n ; len++){
                for(int i = 0 ; i+len <= n ; i++){
                    int j = i + len - 1;
                    int x, y, z;
                    x = (i+2 <= j) ? dp[i+2][j] : 0;
                    y = (i+1 <= j-1 ) ? dp[i+1][j-1] : 0;
                    z = (i <= j-2) ? dp[i][j-2] : 0;
                    
                    dp[i][j] = Math.max(ar[i]+Math.min(x, y), ar[j] + Math.min(y, z));
                }
            }
            
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++)
                    System.out.println(dp[i][j]);
            }
            
            return dp[0][n-1];
            
        }
    }
    
    
    public static void main(String args[]){
        
    }
    
    /*Complete the function below*/
    
    
}
