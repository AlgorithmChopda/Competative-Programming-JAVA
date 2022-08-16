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
public class _1641_countsortedvowel {
    
    class Solution {
        public int countVowelStrings(int n) {
            int dp[] = {1, 2, 3, 4, 5}; 
            for(int i = 2 ; i <= n ; i++)
                for(int j = 1 ; j < 5 ; j++)
                    dp[i] += dp[i-1];
            return dp[4];
        }
    }
    
    
    public static void main(String args[]){

    }
            
}
