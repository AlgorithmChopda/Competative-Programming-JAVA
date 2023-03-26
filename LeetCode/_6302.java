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
public class _6302 {
    public long maxScore(int[] ar1, int[] ar2, int k) {
        int n = ar1.length;
        // 0 -> ar1, 1 -> ar2; 
            PriorityQueue<int[]> q = new PriorityQueue<>( (a, b) -> b[1] - a[1]);
            
        for(int i = 0 ; i < n ; i++)   {
            int ar[] = new int[2];
            ar[0] = ar1[i];
            ar[1] = ar2[i];
            q.add(ar);
        }     
        
        PriorityQueue<int[]> kq = new PriorityQueue<>( (a, b) -> b[1] - a[1]);
        
        int sum = 0;
        while(kq.size() < k){
            int temp[] = q.remove();
            sum += temp[0];
            kq.add(temp);
        }
        
        int temp[] = q.remove();
        sum += temp[0];
        int val = sum * temp[1];
        
        while(q.isEmpty() == false){
            int fun[] = q.remove();
            sum += fun[0];
            kq.add(fun);
            int r[] = kq.remove();
            sum -= r[0];          
            
            if(fun[0] != r[0] || fun[1] != r[1])
                val = Math.max(val, sum * fun[1]);
        }
        
        return val;
    }
}
