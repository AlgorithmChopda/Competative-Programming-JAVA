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
public class _6368 {
    public int[] divisibilityArray(String word, int m) {
        int ar[] = new int[word.length()];
        int val = 0;
        int op[] = new int[ar.length];
        for(int i = 0 ; i < word.length() ; i++){
            val += (word.charAt(i) - '0');
            if(val % m == 0)
                op[i] = 1;
            else
                op[i] = 0;
            val %= m;
        }

        return op;
    }
}
