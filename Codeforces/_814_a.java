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
public class _814_a {
    static class Solution {
        public void solve(Scanner sc){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if( (a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0) )
                System.out.println("Tonya");
            else
                System.out.println("Burenka");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
