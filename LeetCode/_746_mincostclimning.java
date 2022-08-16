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
public class _746_mincostclimning {
    
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int dp[] = new int[cost.length];
            dp[0] = cost[0];     dp[1] = cost[1];
            for(int i = 2 ; i < cost.length ; i++)
                dp[i] = cost[i]+Math.min(dp[i-1], dp[i-2]);
            return Math.min(dp[cost.length-1], dp[cost.length-2]);
        }
    }
    
    public static void main(String args[]){
        
    }
}
