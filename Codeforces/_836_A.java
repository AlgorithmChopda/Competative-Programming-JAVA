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
public class _836_A {
    static class Solution {
        public void solve(Scanner sc){
            String str = sc.next();
            System.out.println(str+""+new StringBuilder(str).reverse());
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
