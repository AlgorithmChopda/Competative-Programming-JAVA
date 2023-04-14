/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _6364 {
   public int miceAndCheese(int[] r1, int[] r2, int k) {
       Queue<int []> q = new PriorityQueue<>( (a,b) -> {
           return b[0] - a[0];
       });
       
       int n = r1.length;
       for(int i = 0 ; i < n ; i++){
           if(r1[i] > r2[i]){
               q.add(new int[]{r1[i] - r2[i], i, r1[i]});
           }
       }
       
       boolean v[] = new boolean[n];
       int sum = 0;
       for(int i = 0 ; i < k ; i++){
           if(q.isEmpty()){
               break;
           }
           int t[] = q.remove();
           sum += t[2];
           v[t[1]] = true;
       }
       
       System.out.println("sum1 : "+sum);
       for(int i = 0 ; i < n ; i++){
           if(!v[i]){
               sum += r2[i];
           }
       }
       
       
       System.out.println("sum2 : "+sum);
       return sum;
   } 
}
