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
public class _6254 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
        
        public long dividePlayers(int[] ar) {
            int n = ar.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0, min = 1005;
            for(int i = 0 ; i < n ; i++){
                if(map.containsKey(ar[i]))
                    map.put(ar[i], map.get(ar[i]) + 1);
                else
                    map.put(ar[i], 1);
                max = Math.max(max, ar[i]);
                min = Math.min(min, ar[i]);
            }
            
            int k = max + min;
            int product = 0;
            for(int i = 0 ; i < n ; i++){
                System.out.print(ar[i] +" : ");
                if(!map.containsKey(ar[i])) continue;                 
                if(map.containsKey(k - ar[i])){
                    System.out.print("in map");
                    map.put(ar[i], map.get(ar[i]) - 1);
                    if(map.get(k - ar[i]) > 0){
                        product += (ar[i] * (k - ar[i]));
                        map.put( k - ar[i], map.get(k - ar[i]) - 1);
                        System.out.println(" added ");
                    }
                    else
                        return -1;
                }
                else
                    return -1;
            }
            
            return -1;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
