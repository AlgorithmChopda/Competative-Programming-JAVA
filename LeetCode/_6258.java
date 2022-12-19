/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6258 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
    }

    public int longestSquareStreak(int[] ar) {
        Arrays.sort(ar);
        HashSet<Integer> map = new HashSet<>();
        int max = -1;
        for(int i = 0 ; i < ar.length ; i++)
            map.add(ar[i]);
        for(int i = 0 ; i < ar.length ; i++){
            if(map.contains(ar[i])){
                map.remove(ar[i]);
                int val = ar[i];
                int cnt = 1;
                while(map.contains(val * val)){
                    cnt++;
                    map.remove(val * val);
                    val *= val ;
                }
                max = Math.max(max, cnt);
            }
        }
        
        return max;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
