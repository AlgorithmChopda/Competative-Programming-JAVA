/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6262 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
        
        public int maxStarSum(int[] val, int[][] edges, int k) {
            int n = val.length;
            ArrayList<Integer> ar[] = null;
            for(int i = 0 ; i < n ; i++)
                   ar[i] = new ArrayList<>();
            
            for(int i = 0 ; i < edges.length ; i++){
                int u = edges[i][0], v = edges[i][1];
                ar[u].add(val[v]);
                ar[v].add(val[u]);
            }
            
            for(int i = 0 ; i < n ; i++)
                Collections.sort(ar[i]);
            
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < n ; i++){
                int sum = 0;
                if(ar[i].size() < k)    continue;
                for(int j = k-1 ; j < ar[i].size() ; j++)
                    sum += ar[i].get(k);
                max = Math.max(sum, max);
            }
            
            return max;
        }   
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
