/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _814_b {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            if(k % 4 == 1 || k % 4 == 3){
                System.out.println("YES");
                for(int i = 1 ; i <= n ; i += 2)
                    System.out.println(i+" "+(i+1));         
                return;
            }
            
            if(k % 4 == 2){
                System.out.println("YES");
                for(int i = 1 ; i <= n ; i += 2){
                    if(i % 4 == 1)
                        System.out.println((i+1)+" "+(i));         
                    else
                        System.out.println(i+" "+(i+1));         
                }
            }
            else
                System.out.println("NO");
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) 
            new Solution().solve(sc);
    }
}
