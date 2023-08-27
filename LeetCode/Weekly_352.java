/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_352 {
    boolean[] temp (int num) {
        boolean[] bool = new boolean[num];
     
      for (int i = 0; i< bool.length; i++) {
         bool[i] = true;
      }
      for (int i = 2; i< Math.sqrt(num); i++) {
         if(bool[i] == true) {
            for(int j = (i*i); j<num; j = j+i) {
               bool[j] = false;
            }
         }
      }
      
      return bool;
    }
    public List<List<Integer>> findPrimePairs(int n) {
        boolean check[] = temp(n);
        List<List<Integer>> ar = new ArrayList<>();
        for(int i = 2 ; i <= n/2 ; i++) {
            if(check[i] && check[n - i]) {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(i);   a.add(n - i);
                ar.add(a);
            }
        }
        
        return ar;
    }
    
    int[] find(int ar[], int index) {
        int min = Integer.MAX_VALUE, max = -1;
        for(int i = index - 1 ; i >= 0 ; i--) {
            if(Math.abs(ar[index] - ar[i]) >= 3)    return new int[] {i, min, max};
            min = Math.min(min, ar[i]);
            max = Math.max(max, ar[i]);
        }
        
        return new int[] {0};
    }
    public long continuousSubarrays(int[] ar) {
        int min = ar[0], max = ar[0];
        int index = 0, endIndex = -1;
        
        long res = 0;
        for(int i = 1 ; i < ar.length ; i++) {
            if(ar[i] >= min && ar[i] <= max)    continue;
            if(ar[i] < min) {
                if(Math.abs(ar[i] - max) >= 3) {
                    // break;
                    long n = (long) (i - index);
                    long curr = n * (n + 1) / 2;
                    
                    if(endIndex != -1) {
                        long ele = endIndex - index;    ele++;
                        curr -= ( ele * (ele + 1) / 2);
                    }
                    
                    res += curr;
                    
                    int temp[] = find(ar, i);
                    index = temp[0];    min = temp[1];  max = temp[2];
                    
                    endIndex = i-1;
                }
                else {
                   min = ar[i];
                }
            }
            else {
                if(Math.abs(ar[i] - min) >= 3) {
                    // break
                    // break;
                    long n = (long) (i - index);
                    long curr = n * (n + 1) / 2;
                    
                    if(endIndex != -1) {
                        long ele = endIndex - index;    ele++;
                        curr -= ( ele * (ele + 1) / 2);
                    }
                    
                    res += curr;
                    
                    int temp[] = find(ar, i);
                    index = temp[0];    min = temp[1];  max = temp[2];
                    
                    endIndex = i-1;
                }
                else {
                    max = ar[i];
                }
            }
        }
        
        return res;
    }
}
