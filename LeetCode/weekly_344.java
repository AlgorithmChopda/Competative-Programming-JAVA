/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class weekly_344 {
    class FrequencyTracker {
     HashMap<Integer, Integer> map;
     HashMap<Integer, Integer> fre;
     
    public FrequencyTracker() {
        map = new HashMap<>();
        fre = new HashMap<>();
    }
    
    public void add(int n) {
        int val = -1;
        if(map.containsKey(n)) {
            val = map.get(n) + 1;
            map.put(n, val);
            
            if(fre.containsKey(val)) {
                fre.put(val, fre.get(val) + 1);
            }
            else { 
                fre.put(val, 1);
            }
            
            fre.put(val-1, fre.get(val - 1) - 1);
        }
        else {
            val = 1;
            map.put(n, 1);
            
            fre.put(val, 1);
        }
    }
    
    public void deleteOne(int n) {
        if(map.containsKey(n) && map.get(n) >= 1) {
            int val = map.get(n) - 1;
            map.put(n, map.get(n) - 1);
           
            if(fre.containsKey(val)) {
                fre.put(val, fre.get(val) + 1);
            }
            else {
                fre.put(val, 1);
            }
            
            fre.put(val + 1, fre.get(val + 1) - 1);
        }        
    }
    
    public boolean hasFrequency(int f) {
        // System.out.println("Frequency : "+f);
        if(fre.containsKey(f) && fre.get(f) >= 1)   return true;
        return false;
    }
}
    
    
    public int[] colorTheArray(int n, int[][] q) {
        int op[] = new int[n];
        
        int cnt[] = new int[n];
        int k = 0;
        int temp = 0;
        for(int i[] : q) {
            
            
            int index = i[0] - 1;
            // remove
            if(index <= (n - 2)) {
                if(cnt[index] == cnt[index + 1]) {
                    temp = Math.max(--temp, 0);
                }
            }
            
            if(index >= 1) {
                if(cnt[index] == cnt[index - 1]) {
                    temp = Math.max(--temp, 0);
                }
            }
            
            // add count 
            cnt[index] = i[1];
            if(index <= (n-2) ) {
                if(cnt[index] == cnt[index + 1]) {
                    temp++;
                }
            }
            
            if(index >= 1) {
                if(cnt[index] == cnt[index - 1]) {
                    temp = Math.max(--temp, 0);
                }
            }
            
            op[k++] = temp;
        }
        
        return op;
    }
    
    
}
