/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6246 {
    static class Solution {
        
        public int countSubarrays(int[] ar, int k) {
            int index = -1;
            int n = ar.length;
            int stat[] = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                if(ar[i] == k){
                    index = i;
                    continue;
                }
                if(ar[i] < k)
                    stat[i] = -1;
                else
                    stat[i] = 1;
                
            }
            
            if(index == -1)
                return 0;
            
            int left[] = new int[n];
            int right[] = new int[n];
            HashMap<Integer, Integer> right_map = new HashMap<>();
            HashMap<Integer, Integer> left_map = new HashMap<>();
            
            int cnt = 1;
            
            right[index+1] = stat[index+1];
            for(int i = index+2 ; i < n ; i++){
                right[i] = stat[i]+right[i-1];
                if(right[i] == 0 || right[i] == 1)
                    cnt++;
                if(right_map.containsKey(right[i]))
                    right_map.put(right[i], right_map.get(right[i]) + 1);
                else
                    right_map.put(right[i], 1);
            }
            
            left[index-1] = stat[index-1];
            for(int i = index-2 ; i >= 0 ; i--){
                left[i] = stat[i]+left[i+1];
                if(left[i] == 0 || left[i] == 1)
                    cnt++;
                if(left_map.containsKey(left[i]))
                    left_map.put(left[i], left_map.get(left[i]) + 1);
                else
                    left_map.put(left[i], 1);
            }
            
            for(int i : left)
                System.out.println(i);
            System.out.println("\n ");
            for(int i : right)
                System.out.println(i);
            
            for(int i = index+1 ; i < n ; i++){
                int exp = Math.negateExact(right[i]);
                if(left_map.containsKey(exp))
                    cnt += left_map.get(exp);
            }
            
            /*for(int i = index-1 ; i >= 0 ; i--){
                int exp = Math.negateExact(left[i]);
                if(right_map.containsKey(exp))
                    cnt += right_map.get(exp);
            }*/
            
            return 0;
        }

        public void solve(Scanner sc) {

        }
        
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
