/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class Biweekly_105 {
   
    
    int dp[];
   int _rec(int index, String s, HashSet<String> set) {
       if(index >= s.length())  return 0;
       if(dp[index] != -1) return dp[index];
       
       String temp = "";
       int ans = Integer.MAX_VALUE;
       for(int i = index ; i < s.length() ; i++) {
           temp += s.charAt(i) + "";
           if(set.contains(temp)) {
               ans = Math.min(ans, _rec(i+1, s, set));
           }
           else {
               ans = Math.min(ans, _rec(i+1, s, set) + temp.length());
           }
       }
       
       dp[index] = ans;
       return ans;
   }
   
   public int minExtraChar(String s, String[] d) {
       dp = new int[s.length()];
       Arrays.fill(dp, -1);
        HashSet<String> set = new HashSet<>();
        for(String t : d) {
            set.add(t);
        }
        return _rec(0, s, set);
    } 
   
    public long maxStrength(int[] ar) {
        ArrayList<Integer> t = new ArrayList<>();
        long ans = 1;
        for(int i : ar) {
            if(i >= 1) {
                ans *= i;
            }
            if(i < 0) {
                t.add(i);
            }
        }
        
        long temp = -1;
        long max = -1;
        for(int i = 0 ; i < t.size() ; i++){
            if(i == 0) {
                temp = t.get(i);
                continue;
            }
            temp *= t.get(i);
            max = Math.max(max, temp);
        } 
        
        for(int i = t.size() - 1; i >= 0 ; i--) {
            if(i == t.size() -1) {
                temp = t.get(i);
                continue;
            }
            temp = temp * t.get(i);
            max = Math.max(max, temp);
        }
        
        
        return ans * max;
    }
    
    
    int r, c;
    int top(int i, int j, int mat[][]) {
        HashSet<Integer> s = new HashSet<>();
        i--;    j--;
        while(i >= 0 && j >= 0 && i < r && j < c) {
            s.add(mat[i][j]);
            i--; j--;
        }
        
        return s.size();
    }
    
    int bottom(int i, int j, int mat[][]) {
        HashSet<Integer> s = new HashSet<>();
        i++;    j++;
        while(i >= 0 && j >= 0 && i < r && j < c) {
            s.add(mat[i][j]);
            i++; j++;
        }
        
        return s.size();
    }
    
    public int[][] differenceOfDistinctValues(int[][] m) {
        r = m.length;
        c = m[0].length;
        
        int op[][] = new int[r][c];
        
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                op[i][j] = Math.abs(top(i, j, m) - bottom(i, j, m));
            }
        }
        
        return op;
    }
    
    
    int calCost(char c[], int var) {
        int icnt = 0;
        for(int i = c.length - 1 ; i >= 0 ; i--) {
//            if(icnt == 0) {
//                
//            }
//            else {
//                
//            }
        }
        
        return 0;
    }
    
    int BS_1(int s, int e, char c[]) {
        while(s <= e) {
            int mid = s + (e - s) / 2;
            
            int ans = calCost(c, 1);
        }
        
        return 0;
    }
    
    public long minimumCost(String s) {
        char c[] = s.toCharArray();
        int n = (c.length * (c.length + 1)) / 2;
        
        return 1l;
    }
    
    
}



