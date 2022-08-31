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
public class _814_c {
    static class Solution {
        public void solve(Scanner sc){        
            
            int n = sc.nextInt();
            int q= sc.nextInt();
                    
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            int op[] = new int[n];
            int index;
            
            if(ar[0] > ar[1]){
                op[0] = 1; 
                index = 0;
            }
            else{
                op[1] = 1; 
                index = 1;
            }
         
            for(int i = 2 ; i < n ; i++){
                if(ar[i] > ar[index]){
                    op[i] = 1;
                    index = i;
                }
                else
                    op[index]++; 
            }
            System.out.println("\n ");
            for(int i : op)
                System.out.print(i+" ");
            
            System.out.println("\n ");
            for(int i = 0 ; i < q ; i++){
                int ele = sc.nextInt();
                int operation = sc.nextInt();
                
                System.out.println(op[ele-1]);
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