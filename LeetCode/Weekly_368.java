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
public class Weekly_368 {
    public int minimumSum(int[] ar) {
        int n = ar.length;
        int left[] = new int[n];
        left[0] = ar[0];
        
        for(int i = 1 ; i < n ; i++)  {
            left[i] = Math.min(left[i], ar[i]);
        }
        
        int right[] = new int[n];
        right[n - 1] = ar[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--)  {
            right[i] = Math.min(right[i], ar[i]);
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i = 1 ; i < n - 1 ; i++) {
            if(left[i] < ar[i] && right[i] < ar[i]) {
                ans = Math.min(left[i] + right[i] + ar[i], ans);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
   
    boolean check(int ar[], int val) {
        return true;
    }
    public int minGroupsForValidAssignment(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i : ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            max = Math.max(max, map.get(i));
        }
        
        int temp[] = new int[map.size()];
        int index = 0;
        Set<Integer> set = map.keySet();
        for(Integer i : set) {
          temp[index++] = map.get(i);
        }
        
        
        
        int start = 1, end = max;
        while(start <= end) {
            int mid = start + ( end - start ) / 2;
            
        }
        
        return 0;
    }
}
