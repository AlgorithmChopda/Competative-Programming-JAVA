/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class _6300 {
    public int getCommon(int[] ar1, int[] ar2) {
        
        HashSet<Integer> h2 = new HashSet<>();
        for(int i : ar2)
            h2.add(i);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < ar1.length ; i++){
            if(h2.contains(ar1[i])){
                min = Math.min(min, ar1[i]);
            }
        }
        
        return min;
    }
}
