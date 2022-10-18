/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _828_A {
    static class Solution {
        public String solve(Scanner sc){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            HashMap<Integer, Character> hs = new HashMap<>();
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            String str = sc.next();
            for(int i = 0 ; i < n ; i++)
                hs.put(ar[i], str.charAt(i));
            
            for(int i = 0 ; i < n ; i++)
                if(str.charAt(i) != hs.get(ar[i]))
                    return "NO";
            
            return "YES";
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            System.out.println(""+new Solution().solve(sc));
    }
}
