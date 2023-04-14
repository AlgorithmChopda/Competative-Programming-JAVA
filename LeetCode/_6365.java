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
public class _6365 {
    public int[] minReverseOperations(int n, int p, int[] banned, int k) {
        // k == 1
        // n == k
        // n == banned.length
        
        HashSet<Integer> set = new HashSet<>();
        for(int  i = 0 ; i < banned.length ; i++){
            set.add(banned[i]);
        }
        
        int op[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            op[i] = -1;
        }
        
        op[p] = 0;
        
        if(k == 1 || n == banned.length - 1){
            return op;
        }
        
        k--;
        int cnt = 1;
        for(int i = k ; i < n ; i += k) {
            if(set.contains(i)) {
                return op;
            }
            
            op[i] = cnt;
            cnt++;
        }
        
        for(int i = k ; i >= 0 ; i = i - k) {
            if(set.contains(i)) {
                return op;
            }
            
            if(op[i] == -1)
                continue;
            
            op[i] = cnt;
            cnt++;
        }
        return op;
    }
}
