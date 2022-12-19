/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6265 {
    static class Solution {
        
            public boolean check(String s, String s1){
                HashSet<Character> map = new HashSet<>();
                HashSet<Character> map1 = new HashSet<>();
                for(int i = 0 ; i < s.length() ; i++){
                    map.add(s.charAt(i));
                }

                for(int i = 0 ; i < s1.length() ; i++){
                    map1.add(s1.charAt(i));
                    if(!map.contains(s1.charAt(i)))
                        return false;
                }

                for(int i = 0 ; i < s.length() ; i++){
                    if(!map1.contains(s.charAt(i)))    return false;
                }

                return true;
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
