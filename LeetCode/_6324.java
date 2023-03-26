/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class _6324 {
    public int maximizeGreatness(int[] ar) {
        Arrays.sort(ar);
        int i = 0, j = 0; 
        while(j < ar.length){
            while(j < ar.length && ar[i] == ar[j]){
                j++;
            }
            if(j < ar.length){
                i++;
                j++;
            }
            else
                break;
        }
        
        return i;
    }
}
