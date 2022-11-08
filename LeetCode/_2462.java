/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _2462 {
    static class Solution {
        public void solve(Scanner sc){
            int ar[] = new int[100];
            int k = 3;
            int c = 0;
            
            PriorityQueue<Integer> p1 = new PriorityQueue<>();
            PriorityQueue<Integer> p2 = new PriorityQueue<>();
            
            for(int i = 0 ; i < c ; i++)
                p1.add(ar[i]);
            
            for(int i = ar.length-1 ; ; i++){
                if(i == c-1)
                    break;
                p2.add(ar[i]);
            }
            
            int start = c, end = ar.length-c-1;
            long cost = 0;
            for(int i = 0 ; i < k ; i++){
                if(p2.isEmpty()){
                    cost += p1.remove();
                    continue;
                }
                
                if(p1.peek() < p2.peek() )
                    cost += p1.remove();
                else
                    cost += p2.remove();
                
                // more element exists
                if(start <= end){
                    if(ar[start] <= ar[end]){
                        p1.add(ar[start]);
                        start++;
                    }
                    else{
                        p1.add(ar[end]);
                        end--;
                    }
                }
            }
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
