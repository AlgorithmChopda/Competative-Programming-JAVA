/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class _347_topkfrequent {
    public int[] topKFrequent(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < ar.length ; i++)
            map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
        
        PriorityQueue<Integer> q = new PriorityQueue<>( (a, b) -> {
            return map.get(a) - map.get(b);
        });
        
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            q.add(ele.getKey());
        }
        
        for(Integer i : q)
            System.out.println(i);
        return new int[0];
    }
}
