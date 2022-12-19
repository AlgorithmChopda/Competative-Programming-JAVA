/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6257 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
    }

    public int deleteGreatestValue(int[][] grid) {
        for(int i = 0 ; i < grid.length; i++)
            Arrays.sort(grid[i]);
        int sum = 0;
        for(int j = grid[0].length-1; j >= 0; j-- ){
            int max = -1;
            for(int i = 0 ; i < grid.length ; i++){
                max = Math.max(grid[i][j], max);
            }
            sum += max;
        }
        
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
