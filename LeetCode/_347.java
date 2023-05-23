/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _347 {
    public int[] topKFrequent(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : ar) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        
        Queue<int []> pq = new PriorityQueue<>( (int a[], int b[]) -> {
            if(a[1] > b[1]) return 1;
            return -1;
        });
        
        for(Map.Entry<Integer, Integer> item : map.entrySet()) {
            pq.add(new int[] {item.getKey(), item.getValue()});
        }
        
        int op[] = new int[k];
        int index = 0;
        for(int i = 0 ; i < k ; i++) {
            op[index++] = pq.remove()[0];
        }
        
        return op;
    }
}
