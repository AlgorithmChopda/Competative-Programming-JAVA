/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6266 {
    static class Solution {
        
        public static int primeFactors(int n)
    {
        int sum = 0;
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                sum += c;
                n /= c;
            }
            else
                c++;
        }
        
        return sum;
    }
        
        public void solve(Scanner sc){
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
