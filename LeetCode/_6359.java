/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _6359 {
    public int minimizeMax(int[] ar, int p) {
        Arrays.sort(ar);
//        LinkedList<Integer> l = new LinkedList<>();
//        for(int i = 0 ; i < ar.length ; i++) {
//            l.add(ar[i]);
//        }
        Queue<Integer> q = new PriorityQueue<>();
        int i = 0, j = 2;
        while(j < ar.length) {
//            int a = l.get(i) - l.get(i-1);
//            int b = l.get(i+1) - l.get(i);
            
            int a = ar[j] - ar[j-1];
            int b = ar[j-1] - ar[i];
            
            if(a < b) { 
                q.add(a);
                j += 2;
            }
            else{
                i += 2;
                j++;
            }
        }
        
        int ans = 0;
        for(int k = 0 ; i < p ; i++) {
            ans = Math.max(ans, q.remove());
        }
        
        return ans;
    }
}
