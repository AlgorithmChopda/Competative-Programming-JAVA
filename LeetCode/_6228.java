/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6228 {
    static class Solution {
        
        public boolean check(String a, String b){
           int k = 2;
           for(int i = 0 ; i < b.length() ; i++){
               if(b.charAt(i) != a.charAt(i)){
                   if(k == 0)
                       return false;
                   k--;
               }
           }
           return true;
        }
        
        public List<String> solve(Scanner sc){
            String q[] = {} , d[] = {};
            List<String> op = new ArrayList<>();
            for(int i = 0 ; i < q.length ; i++){
                for(int j = 0 ; j < d.length; j++){
                    if(check(d[j], q[i])){
                        op.add(q[j]);
                        break;
                    }
                }
            }
            
            return op;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
