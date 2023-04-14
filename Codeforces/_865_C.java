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

public class _865_C {
    static class Solution {
        public boolean solve(Scanner sc){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++) {
                ar[i] = sc.nextInt();
            }
            
            boolean flag = true;
            for(int i = 1 ; i < n ; i++) {
                if(ar[i] < ar[i-1]) {
                    flag = false;
                    break;
                }
            }
        
            if(flag) {
                return true;
            }
            
            for(int i = 1 ; i < n ; i++) {
                if(ar[i-1] > ar[i]) {
                    int val = ar[i];
                    ar[i] += val;
                    if(i + 1 < n ) {
                        ar[i+1] += val;
                    }
                    else{
                        return false;
                    }
                }            
            }
            
            return true;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            System.out.println(new Solution().solve(sc));
        }
    }
}
