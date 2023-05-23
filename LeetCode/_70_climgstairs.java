/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _70_climgstairs {

    boolean isPrime(int no ) {
        if(no <= 1) return false;
        for(int i = 2; i * i <= no; i++){
            if(no % i == 0) return false;
        }
        return true;
    }

    public int climbStairs(int n) {
        
        if(n <= 2)  return n; 
        
        int prev_one = 1, prev_two = 2, cur = 1;
        
        for(int i = 3 ; i <= n ; i++){
            cur = prev_one + prev_two;
            prev_one = prev_two;
            prev_two = cur;
        }
        
        return cur;
    }
    
    public static void main(String args[]){

    }
}
