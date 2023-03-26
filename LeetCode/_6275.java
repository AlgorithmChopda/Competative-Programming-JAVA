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
public class _6275 {
    public long minOperations(int[] ar1, int[] ar2, int k) {
        int n = ar1.length;
        
        int neg = 0 ;
        int pos = 0;
        
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 0 ; i < n ; i++){
            if(ar1[i] == ar2[i])    continue;
            
            int diff = Math.abs(ar1[i] - ar2[i]);
            if(diff % k != 0)
                return -1;
            if(ar1[i] > ar2[i]){
                cnt++;
                neg += diff;
            }
            else{
                cnt1++;
                pos += diff;
            }
        }
      
        if(pos == neg)
            return Math.max(cnt, cnt1);
        return -1;
        
        /*neg = 0;
        pos = 0;
        for(int i = 0 ; i < n ; i++){
            int diff = Math.abs(ar1[i] - ar2[i]);
            if(ar1[i] > ar2[i])
                neg += diff;
            else
                pos += diff;
        }*/
    }
}
