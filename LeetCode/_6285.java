/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class _6285 {
    public long maxKelements(int[] ar, int k) {
        PriorityQueue<Integer> op = new PriorityQueue<>( (a,b) -> b-a );
        for(int i : ar)
            op.add(i);
        long ans = 0;
        for(int i = 0 ; i < k ; i++){
            int val = op.remove();
            op.add((int)Math.ceil(val / 3));
            ans += val;
        }
        
        return ans;
    }
}
