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
public class _834_c {
    static class Solution {
        public void solve(Scanner sc){
            long l = sc.nextLong(), r = sc.nextLong(), x = sc.nextLong();
            long a = sc.nextLong(), b = sc.nextLong();
            long cnt = 0, val = b;
            
            long mod = b % x;
            
            long left = ( (l+x) % x);
            left = (l+x) - left;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
