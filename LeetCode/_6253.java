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
public class _6253 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
        
         public boolean isCircularSentence(String s) {
             String str[] = s.split(" ");
             for(int i = 1; i  < str.length ; i++){
                 if(str[i].charAt(0) != str[i-1].charAt(str[i-1].length()-1))
                     return false;
             }
             if(str[0].charAt(0) != str[str.length-1].charAt(str[str.length-1].length()-1))
                 return false;
            return true;
         }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
