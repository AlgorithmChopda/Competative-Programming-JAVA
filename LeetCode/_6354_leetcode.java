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
public class _6354_leetcode {
    public int kItemsWithMaximumSum(int one, int zero, int none, int k) {
        if(k <= one)
            return k;
        if(k <= one + zero)
            return one;
        
        int rem = k - (one + zero );
        return one - rem;
    }
}
