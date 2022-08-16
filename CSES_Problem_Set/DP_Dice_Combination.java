/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSES_Problem_Set;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class DP_Dice_Combination {
   
    public static void main(String args[]){
        
        final double MOD = 10e9 + 7;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long dp[] = new long[n+1];
        dp[0] = dp[1] = 1;
        
        long sum = 0;
        for(int i = 2 ; i <= n; i++){
            for(int j = 1 ; j <= 6  ; j++){
                if(j > i)   break;
                dp[i] = (long) ((long)( (dp[i-j]%MOD) + (dp[i]%MOD) )%MOD);
            }
        }
        
        System.out.println(dp[n]);
                
    }
}
