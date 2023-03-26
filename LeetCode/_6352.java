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
public class _6352 {
    public int beautifulSubsets(int[] ar, int k) {
        int n = ar.length;
        int cnt[] = new int[n];
        for(int l = 0 ; l < n ; l++){
            for(int i = n - 1 ; i >= 0 ; i--){
                if(Math.abs(ar[l] - ar[i]) == k)
                    continue;
                int ans = 0;
                for(int j = i+1; j < n ; j++){
                    if(Math.abs(ar[i] - ar[j]) != k && Math.abs(ar[l] - ar[j]) != k){
                        ans++;
                        ans += cnt[j];
                    }
                }
                cnt[i] = ans;
            }
        }
        int op = ar.length;
        for(int i = 0 ; i < n ; i++)
            op += cnt[i];
       
        return op;
    }
}
