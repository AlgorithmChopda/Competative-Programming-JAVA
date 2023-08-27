/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class DP_Strings {
    static int ans = Integer.MAX_VALUE;
    static int rec(int index, String s, int f[], int day) {
        if(index == s.length()) {
            if(check(f)) {
                return day;
            }
            return - 1;
        }
        
        // pick
        f[s.charAt(index) - 'a']++;
        int pick = rec(index + 1, s, f, day);
        f[s.charAt(index) - 'a']--;
        
        // not pick

        int temp[] = new int[26];
        temp[s.charAt(index) - 'a']++;
        int notpick = rec(index + 1, s, temp, day + 1);

        if(pick == -1) return notpick;
        if(notpick == -1)   return pick;
        
        return Math.min(pick, notpick);
    }

    static boolean check(int[] f) {
        int val = -1;
        for(int i : f) {
            if(i == 0) continue; 
            if(val == -1) {
                val = i;
                continue;
            }
            
           if(i != val)     return false;
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        dp = new int [s.length()];
        Arrays.fill(dp, -1);
        System.out.println(forward(0, s));
    }
    
    static int dp[];
    static int forward(int index, String s) {
        if(index == s.length()) {
            return 0;
        }
        
        if(dp[index] != -1) return dp[index];
        
        int f[] = new int[26];
        int min = Integer.MAX_VALUE;
        
        for(int i = index ; i < s.length() ; i++) {
            f[s.charAt(i) - 'a']++;
            if(check(f)) {
                min = Math.min(min, forward(i + 1, s) + 1);
            }
        }
        
        return dp[index] = min;
    }
}
