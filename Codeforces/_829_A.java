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
public class _829_A {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++)
                sc.nextInt();
            n = 10 - n;
            System.out.println(((((n-1) * n) / 2) * 6));
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
