/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_359 {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 1;
        while(set.size() != n) {
            if(!set.contains(k - i)) {
                set.add(i);
            }
        }
        
        int ans = 0;
        for(int temp : set) {
            ans += temp;
        }
        
        return ans;
    }
    
    public int maximizeTheProfit(int n, List<List<Integer>> o) {
        // src, cost
        ArrayList<int []> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++) {
            ar[i] = new ArrayList<>();
        }
        
        for(List<Integer> i : o) {
            int dest = i.get(1), src = i.get(0), cost = i.get(2);
            ar[dest].add( new int[] {src, cost} );
        }
        
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for(int i = 0 ; i < n ; i++) {
            int max = 0;
            for(int buy[] : ar[i]) {
                int start = buy[0];
                int val = buy[1] + dp[start];
                
                max = Math.max(val, max);
            }
            
            dp[i + 1] = Math.max(dp[i], max);
        }
        
        System.out.println(Arrays.toString(dp));
        
        return dp[n];
    }
    
    int left(ArrayList<Integer> ar, int k) {
        int max = 1, currdiff = 0;
        for(int i = 1 ; i < ar.size() ; i++) {
            int diff = ar.get(i) - ar.get(i - 1) - 1;
            currdiff += diff;
            if(currdiff <= k) { 
                max++;                
            }
            else break;
        }
        
        return max;
    }
    
    int right(ArrayList<Integer> ar, int k) {
        int max = 1, currdiff = 0;
        for(int i = ar.size() - 2; i >= 0 ; i--) {
            int diff = ar.get(i + 1) - ar.get(i) - 1;
            currdiff += diff;
            if(currdiff <= k) { 
                max++;                
            }
            else break;
        }
        
        return max;
    }
    
    int def(List<Integer> ar) {
        int i = 0, max = 0;
        while(i < ar.size()) {
            int cnt = 1;
            while(i + 1 < ar.size() && Objects.equals(ar.get(i), ar.get(i + 1))) {
                cnt++;
                i++;
            }
            
            i++;
            max = Math.max(max, cnt);
        }
        
        return max;
    }
    
    public int longestEqualSubarray(List<Integer> a, int k) {
        int n = a.size();
        ArrayList<Integer> ar[] = new ArrayList[n + 1];
        for(int i = 0 ; i <= n ; i++){
            ar[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < n ; i++) {
            int ele = a.get(i);
            ar[ele].add(i);
        }
        
        int ans = 0;
        for(int i = 1 ; i <= n ; i++) {
            int left = left(ar[i], k);
            int right = right(ar[i], k);
            
            ans = Math.max(ans, Math.max(left, right));
        }
        
        return Math.max(ans, def(a));
    }  
}
