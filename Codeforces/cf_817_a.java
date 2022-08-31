/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_817_a {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            String str = sc.next();
            
            if(n != 5){
                System.out.println("NO");
                return;
            }
            
            HashSet<Character> hs = new HashSet<>();
           
            for(int i = 0 ; i < 5 ; i++)
                hs.add(str.charAt(i));
            String s = "Timur";
            
            for(int i = 0 ; i < 5 ; i++){
                if(!hs.contains(s.charAt(i))){
                    System.out.println("NO");
                    return;
                }
            }
            
            System.out.println("YES");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){     
            new Solution().solve(sc);
        }
    }
}
