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
public class _6316 {
    public int maxScore(int[] ar) {
        Arrays.sort(ar);
        for(int i = 0, j = ar.length - 1 ; i < j ; i++, j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        
        for(int i: ar){
            System.out.print(i+" ");
        }
        
        int cnt = 0;
        long sum = 0;
        for(int i = 0 ; i < ar.length ; i++){
            if(ar[i] >= 0){
                cnt++;
                sum += ar[i];
            }
            else{
                sum -= ar[i];
                if(sum >= 0){
                    cnt++;
                }
                else{
                    break;
                }
            }
        }
        
        return cnt;
    }
}
