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
public class _6222 {
    static class Solution {
        public void solve(Scanner sc){
            long no = 5436786;
            int target = 1;
            long mult = 10;
            while(true){
                long copy = no;
                int cs = 0;
                for(; copy > 0; cs += (copy%10), copy /= 10);
                System.out.println("\n "+cs);
                if(cs <= target)
                    break;  
                //System.out.println(no);
                no /= mult; no *= mult; no += mult;
                System.out.println(no+"\n");
                mult *= 10;
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
