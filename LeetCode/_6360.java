/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class _6360 {
    public long[] distance(int[] ar) {
        int n = ar.length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++) {
            if(!map.containsKey(ar[i])) {
                map.put(ar[i], new ArrayList<>());
            }
            map.get(ar[i]).add(i);
        }
        
        long op[] = new long[n];
        for(int i = 0 ; i < n ; i++) { 
            if(!map.containsKey(ar[i])) {
                op[i] = 0;
            }
            else{
                long p[] = new long[n];
                ArrayList<Integer> t = map.get(ar[i]);
                
                long sum = 0;
                for(int j : t){
                    sum += j;
                }
                
                int pre = 0;
                for(int j = 0 ; j < t.size() ; j++) {
                    long a = ((long)j * (long)(t.get(j)) - (long)pre);
                    a = Math.abs(a);
                    int r = (t.size() - 1) - j;
                    pre += t.get(j);
                    long b = (r * t.get(j)) - (sum - pre);
                    b = Math.abs(b);
                    
                    System.out.println(a + "  " + b);
                    op[i] = (a + b);
                    
                }
            }
        }
        
        return op;
    }
}
