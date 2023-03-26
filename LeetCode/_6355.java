/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class _6355 {
    public long countFairPairs(int[] ar, int l, int u) {
        Arrays.sort(ar);
        long ans = 0;
        for(int i = 0 ; i < ar.length ; i++){
            if(ar[i] > u)   return ans;
            int i1 = upper(ar, l-ar[i]);
//            int i2 = lower(ar, u-ar[j]);
            
//            System.out.println(i1 + " " + i2);
                    
        }
        return 0;
    }
    
    public int lower(int ar[], int key) {
        int s = 0, e = ar.length-1;
        while(s <= e){
            int mid = (s+e) / 2;
            if(ar[mid] <= key){
                s = mid + 1;
            }else{
                e = mid-1;
            }
        }
        return s-1;
    }
 
    public int upper(int ar[], int key) {
        int start = 0, end = ar.length-1;
        if(end == 0) return -1;
        if (key > ar[end]) return end;
   
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ar[mid] > key) {
                end = mid - 1;
            }
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
     
}
