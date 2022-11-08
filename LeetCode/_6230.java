/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6230 {
    static class Solution {
        public void solve(Scanner sc){
            int ar[] = new int[100];
            int k = 3;
            
            int n = ar.length;
            HashMap<Integer, Integer> hs = new HashMap<>();
            long sum = 0, max = 0;
            int i = 0;
            while(i < n ){
               if(hs.containsKey(ar[i])){
                    i = hs.get(ar[i]);
                    hs = new HashMap<>();
                    sum = 0;
                }
                else{
                    hs.put(ar[i], i);
                    sum += ar[i];
                }
                
                if(hs.size() == k){
                    max = Math.max(sum, max);
                    hs.remove(i-k);
                }
            }
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
