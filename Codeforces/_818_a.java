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
public class _818_a {
    static class Solution {
        
       int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
  
    // lcm() method returns the LCM of a and b
    int lcm(int a, int b, int gcdValue)
    {
        return Math.abs(a * b) / gcdValue;
    }
        
        public void solve(Scanner sc){
            int n = 10;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    int g = gcd(i, j);
                    int l = lcm(i, j, g);
                    
                    System.out.println(i+" : "+j+" -> "+g+" : "+l);
                }
                System.out.println("\n ");
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
