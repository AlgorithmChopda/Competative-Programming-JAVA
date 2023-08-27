/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;

/**
 *
 * @author Vinay Jain
 */
public class weekly_350 {
    int DFS(ArrayList<Integer> ar[],int index, boolean v[], int no, int temp[]) {
        v[index] = true;
        int sum = 0;
        if(no == v.length)  return 1;
        for(int nei : ar[temp[index]]) {
            if(!v[nei]) {
                sum += DFS(ar, nei, v, no + 1, temp);
            }
        }
        
        return sum;
    }
    public int specialPerm(int[] ar) {
        int n = ar.length;
        int val = 1000000000;
        ArrayList<Integer> g[] = new ArrayList[val];
        for(int i = 0 ; i < n ; i++) g[i] = new ArrayList<>();
        long MOD = (long) 1e9 + 7;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                if(ar[i] % ar[j] == 0 || ar[j] % ar[i] == 0) {
                    g[i].add(j);
                    g[j].add(i);
                }
            }
        }
        
        int ans = 0;
        for(int i = 0 ; i < n ; i++) {
            ans = (int) ((ans + (DFS(g, i, new boolean[n], 0, ar) % MOD)) % MOD);
        }
        
        
        return (int) ans;
    }
}
