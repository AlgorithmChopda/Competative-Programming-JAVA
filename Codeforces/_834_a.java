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
public class _834_a {
    static class Solution {
        public void solve(Scanner sc){
            String temp = "";
            for(int i = 0 ; i < 50 ; i++)
                temp = temp.concat("Yes");
            
            String i = sc.next();
            if(temp.contains(i))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
