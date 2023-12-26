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
public class Weekly_374 {
    public int minimumAddedCoins(int[] ar, int target) {
        Arrays.sort(ar);
        int ans = 0, ele = 1;
        long sum = 0;
        
        while(ele < ar[0]) {
            if(ele > sum) {
                System.out.println(ele);
                ans++;
                sum += ele;
            }
            ele++;
        }
        
        sum += ar[0];
        int i = 1;
        
        while(sum <= target) {
            while(ele == ar[i] && i < ar.length) {
                sum += ar[i++];
            }
            
            if(ele > sum) {
                System.out.println(ele);
                ans++;
                sum += ele;
            }
            ele++;
        }
        
        return ans;
    }
}
