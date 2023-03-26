/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class _6351 {
    public long findScore(int[] nums) {
        Queue<Pair<Integer, Integer>> ar = new PriorityQueue<>( (a, b) -> {
            if(a.getKey() == b.getKey()){
                return a.getValue() - b.getValue();
            }
            return a.getKey() - b.getKey();
        });
        for(int i = 0 ; i < nums.length ; i++){
            ar.add(new Pair(nums[i], i));
        }
        
        HashSet<Integer> done = new HashSet<>();
        long ans = 0;
        while(!ar.isEmpty()){
            Pair<Integer, Integer> temp = ar.remove();
            int i = temp.getValue();
            if(!done.contains(i)){
                ans += temp.getKey();
                done.add(i);
                done.add(i-1);
                done.add(i+1);
                // if(i - 1 >= 0 && !done.contains(i-1))
                //     done.add(i-1);
                // if(i+1 < nums.length && !done.contains(i+1))
                //     done.add(i+1);
            }
        }
        return ans;
    }
}
