/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6196 {
    public int minimumPartition(String s, int k) {
        int i = 0;
        int cnt = 0;
        while( i < s.length() ){
            long val = Integer.parseInt(s.charAt(i) + "");
            if(val > k) return -1;
            while(val <= k){
                i++;
                val = val * 10 + (Integer.parseInt(s.charAt(i) + ""));
            }
            cnt++;
        }
        
        return cnt;
    }
    
    
}
