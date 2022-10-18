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
public class _828_E1 {
    static class Solution {
        public String solve(Scanner sc){
            int a = sc.nextInt(), b = sc.nextInt();
            int c = sc.nextInt(), d = sc.nextInt();
            
            int no = a * b;
            long start = (a+1) * (b+1);
            long end = c * d;
            
            start = start - (start % no);
            while(start < (a+1) * (b+1))
                start += no;
            
            if(start > end)
                return "-1 -1";
            else{
                while(start <= end){
                    for(int i = a+1 ; i <= c ; i++){
                        if(start % i == 0 && (start / i) <= d && (start / i) > b){
                            return ""+i+" "+(start / i)+""; 
                        }
                    }
                    start += no;
                }
            }
            
            return "-1 -1";
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            System.out.println(new Solution().solve(sc));
    }
        
}
