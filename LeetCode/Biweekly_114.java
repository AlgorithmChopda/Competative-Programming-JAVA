/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vinay Jain
 */
public class Biweekly_114 {
    public int minOperations(List<Integer> ar, int k) {
        boolean temp[] = new boolean[ar.size() + 1];
        int ans = 1;
        for(int i = ar.size() - 1 ; i >= 0 ; i--) {
            temp[ar.get(i)] = true;
            boolean flag = false;
            for(int j = 1 ; j <= k ; j++) {
                if(temp[j] == false) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                return ans;
            }
            
            ans++;
        }
        
        return ar.size();
    }
    
    public int minOperations(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        Set<Integer> set = map.keySet();
        int ans = 0;
        for(int k : set) {
            int val = map.get(k);
            if(val == 1 || val == 2)    ans++;
            else {
                ans += (val / 3);
                if(val / 3 != 0)    ans++;
            }
        }
        
        return ans;
    }
    
    int isPossible(int ar[], int mid) {
        return 0;
    }
    public int maxSubarrays(int[] ar) {
        int start = 0, end = ar[0];
        for(int i : ar) end = Math.max(i, end);
        
        int ans = ar.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int val = isPossible(ar, mid);
            
            if(val != -1) {
                ans = val;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        
        return ans;
    }
}
