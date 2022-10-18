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
public class _2443_sum {
    static class Solution {
        public void solve(Scanner sc, HashSet<Integer> sum){
            int n = sc.nextInt();
            if(sum.contains(n))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    static int reverseDigits(int num)
    {
        StringBuffer string = new StringBuffer(String.valueOf(num));
        string.reverse();
        num = Integer.parseInt(String.valueOf(string));
        return num;
    }   
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashSet<Integer> sum = new HashSet<>();
        HashSet<Integer> no = new HashSet<>();
        
        for(int i = 0 ; i <= 100000 ; i++){
            
            if(no.contains(i))
                continue;
            int rev = reverseDigits(i);
            if(!sum.contains(rev+i))
                sum.add((rev+i));
            no.add(rev);
        }
        
        while(n-- > 0){
            new Solution().solve(sc, sum);
        }
    }
}
