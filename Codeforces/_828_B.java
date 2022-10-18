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
public class _828_B {
    static class Solution {
        public void solve(Scanner sc){
            
            int n = sc.nextInt();
            int q = sc.nextInt();
            int ar[] = new int[n];
            
            int even = 0, odd = 0;
            long sum = 0;
            
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(ar[i] % 2 == 0)
                    even++;
                else
                    odd++;
                sum += ar[i];
            }
            
            for(int i = 0 ; i < q ; i++){
                int val = sc.nextInt();
                int no = sc.nextInt();
                
                if(val == 0){
                    sum += (no * even);
                    if(no % 2 != 0){
                        odd += even;
                        even = 0;
                    }
                }
                else{
                    sum += (no * odd);
                    if(no % 2 != 0){
                        even += odd;
                        odd = 0;
                    }    
                }
                
                System.out.println(sum);
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
