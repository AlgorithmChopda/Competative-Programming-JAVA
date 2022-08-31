/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_817_d {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            String str = sc.next();
            
            long or[] = new long[n];
            long ne[] = new long[n];
            long sum = 0;
            
            for(int i = 0 ; i < n ; i++){
                if(str.charAt(i) == 'R'){
                    or[i] = n - i - 1;
                    ne[i] = i;
                }
                else{
                    or[i] = i;
                    ne[i] = n - i - 1;
                }
                sum += or[i];
            }
            
            long ar[] = new long[n];
            int k = 0;
            
            for(int i = 0 ; i < n ; i++){
                if(ne[i] > or[i]){
                    ar[k] = ne[i] - or[i];     
                    k++;
                }
            }
            
            Arrays.sort(ar);
            
            
            /*System.out.println("\n");
            for(int i : or)
                System.out.print(i+" ");
            
            System.out.println("\n");
            for(int i : ne)
                System.out.print(i+" ");
            
            System.out.println("\n");
            for(int i : ar)
                System.out.print(i+" ");
            */
            
            for(int i = n-1 ; i >= 0 ; i--){
                sum += ar[i];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
            
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){     
            new Solution().solve(sc);
        }
    }
}
