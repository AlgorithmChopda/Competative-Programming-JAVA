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
public class e_140_a {
    static class Solution {
        public void solve(Scanner sc){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            
            if(x1 == x2 || x1 == x3 || x2 == x3){
                if(y1 == y2 || y1 == y3 || y2 == y3)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else{
                System.out.println("YES");
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
