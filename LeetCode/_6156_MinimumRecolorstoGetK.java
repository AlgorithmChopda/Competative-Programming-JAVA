/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6156_MinimumRecolorstoGetK {
    static class Solution {
        public int minimumRecolors(String block, int k) {
            int move = Integer.MAX_VALUE;
            for(int i = 0 ; i+k-1 < block.length() ; i++){
                int cnt = 0;
                for(int j = 0 ; j < k ; j++){
                    if(block.charAt(i+j) == 'W')
                        cnt++;
                }
                move = Math.min(move, cnt);
            }
            return move;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        new Solution().minimumRecolors("", 1);
    }
}
