/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class weekly_360 {
    public long minimumPossibleSum(int n, int t) {
        HashSet<Integer> set = new HashSet<>();
        int i = 1;
        long ans = 0;
        while(set.size() < n) {
            if(!set.contains(t - i)) {
                set.add(i);
                ans += i;
            }
            
            i++;
        }
        
        return ans;
    }
    
    int furthestDistanceFromOrigin(String temp) {
        int curr = 0;
        int left = 0, right = 0;
        
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i) == 'L') {
                left++;
            }
            if(temp.charAt(i) == '_') {
                curr++;
            }
            if(temp.charAt(i) == 'R') {
                right++;
            }
            
        }
        curr += Math.max(left,right)-Math.min(left,right);
        return curr;
    }
}
