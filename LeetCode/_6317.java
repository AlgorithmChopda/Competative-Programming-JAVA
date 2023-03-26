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
public class _6317 {
    public long beautifulSubarrays(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(ar[0], 1);
        long cnt = 0;
        int prev = ar[0];
        for(int i = 1 ; i < ar.length ; i++){
            int val = (ar[i] ^ prev);
            if(map.containsKey(val)){
                cnt += map.get(val);
                map.put(val, map.get(val) + 1);
            }
            else
                map.put(val, 1);
            prev = val;
        }
        
        return cnt;
    }
}
