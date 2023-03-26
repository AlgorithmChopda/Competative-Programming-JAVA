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
public class _6321 {
    public int findSmallestInteger(int[] ar, int val) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = ar.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int r = ar[i] % val;
            min = Math.min(r, min);
            if(map.containsKey(r))
                map.put(r, map.get(r) + 1);
            else
                map.put(r, 1);
        }
        
        int index = min + 1;
        while(map.containsKey(index % val) && map.get(index % val) > 0){
            map.put(index%val, map.get(index % val) - 1);
        }
        
        return index;
    }
}
