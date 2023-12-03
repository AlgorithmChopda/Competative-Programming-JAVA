/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_365 {
    public int minSizeSubarray(int[] ar, int t) {
        int n = ar.length;
        HashMap<Long, Integer> left = new HashMap<>();
        long sum = 0;
        for(int i = n - 1 ; i >= 0 ; i--) {
            sum += (long) ar[i];
            if(!left.containsKey(sum))  left.put(sum, (n - i));
        }
        
        HashMap<Long, Integer> right = new HashMap<>();
        sum = 0;
        for(int i = 0 ; i < n ; i++) {
            sum += (long) ar[i];
            if(!right.containsKey(sum))  right.put(sum, i + 1);
        }
        
        int len = ((t / (int) sum) * n);
        int req = t - ( (t / (int) sum) * (int) sum);
        Set<Long> s = left.keySet();
        boolean isFound = false;
        // System.out.println(len + " " + req);
        int min = Integer.MAX_VALUE;
        for(Long k : s) {
            // System.out.println(k + " " + req)
            if(k == req) {
//                len += left.get(k);
                min = left.get(k);
                isFound = true;
                break;
            }
        }
        
        s = right.keySet();
        for(Long k : s) {
            if(k == req) {
                if(isFound)
                    min = Math.min(min , right.get(k));
                else min = right.get(k);
                
                isFound = true;
                break;
            }
        }
        
        s = left.keySet();
        for(Long k : s) {
            int temp = (int) ((long) k);
            int rem = req - temp;
            
            if(right.containsKey((long)rem)) {
                if(isFound)
                    min = Math.min(min, left.get(k) + right.get((long)rem));
                else 
                    min = left.get(k) + right.get((long) rem);
                isFound = true;
            }
        }
        
        if(isFound == false) {
            int ans = Integer.MAX_VALUE;
            for(Long k : s) {
                int temp = (int) ((long) k);
                int rem = t - temp;

                if(right.containsKey((long)rem)) {
                    ans = Math.min(ans, left.get(k) + right.get((long)rem));
                    isFound = true;
                }
            }
            
            if(isFound) return ans;
        }
        
        if(!isFound)    return -1;
        
        return len == 0 ? -1 : len + min;
    }
}
