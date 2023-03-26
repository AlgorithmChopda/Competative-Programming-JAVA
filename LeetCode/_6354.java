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
public class _6354 {
    public long findTheArrayConcVal(int[] ar) {
        long ans = 0;
        for(int i = 0, j = ar.length - 1; i <= j ; i++, j--){
            if(i == j){
                ans += ar[i];
                break;
            }
            int val = Integer.parseInt(Integer.toString(ar[i]) + "" + Integer.toString(ar[j]));
            ans += val;
        }
        
        return ans;
    }
}
