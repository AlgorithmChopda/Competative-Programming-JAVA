/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_371 {
    boolean valid(ArrayList<Integer> ar) {
        int n = ar.size();
//        ArrayList<Integer> ar = new ArrayList<>(pq);
        for(int i = 0 ; i < n - 2 ; i++) {
            int max = ar.get(i) + 99;
            if(ar.get(i + 1) <= max && ar.get(i + 2) <= max)    return true;
        }
        
        return false;
    }
    public List<String> findHighAccessEmployees(List<List<String>> time) {
        HashMap<String, ArrayList<Integer>> ar = new HashMap<>();
        
        for(List<String> temp : time) {
            if(!ar.containsKey(temp.get(0)))    ar.put(temp.get(0), new ArrayList<>());
            ar.get(temp.get(0)).add(Integer.parseInt(temp.get(1)));
        }
        
       Set<String> set = ar.keySet();
       List<String> res = new ArrayList<>();
       
       for(String i : set) {
           Collections.sort(ar.get(i));
           if(valid(ar.get(i))) {
               res.add(i);
           }
       }
       
       return res;
    }
    
    int swapMethod(int a[], int b[]) {
        int max = 0, n = a.length, max1 = 0, m = b.length;
        int lasta = a[n - 1], lastb = b[m - 1];
        
        boolean flag = true;
        int cnt = 1;
        for(int i = 0 ; i < n - 1 ; i++) {
            if(a[i] > lastb && b[i] > lastb)    return -1;
            if(a[i] > lastb)    cnt++;
        }
        
        return cnt;
    }
    public int minOperations(int[] a, int[] b) {
        int max = 0, n = a.length, max1 = 0, m = b.length;
        int lasta = a[n - 1], lastb = b[m - 1];
        
        for(int i : a) max = Math.max(i, max);
        for(int i : b) max1 = Math.max(i, max1);
        
        if(max > max1) {
            if(max != lasta)    return -1;
        }
        else {
            if(max1 != lastb)   return -2;
        }
        
        if(max == lasta && max1 == lastb)  return 0;
        if(max != lasta && max1 != lastb)   return -1;
        
        if(max == lasta) {
//            if(max1 >= max)  return -1;
            int ans1 = swapMethod(a, b);
            int ans2 = 0;
            int cnt = 0;
            for(int i = 0 ; i < n - 1 ; i++) {
                if(a[i] > lastb && b[i] > lastb) {
                    ans2 = -1;
                    break;
                }
                if(b[i] > lastb)    cnt++;
            }
            
            if(ans1 == -1 && ans2 == -1)    return -1;
            if(ans1 == -1)  return cnt;
            if(ans2 == -1)  return ans1;
            
            return Math.min(ans1, cnt);
        }
        else {
            int ans1 = swapMethod(b, a);
            int ans2 = 0;
            int cnt = 0;
            for(int i = 0 ; i < n - 1 ; i++) {
                if(b[i] > lasta && a[i] > lasta) {
                    ans2 = -1;
                }
                if(a[i] > lasta)    cnt++;
            }
            
            if(ans1 == -1 && ans2 == -1)    return -1;
            if(ans1 == -1)  return cnt;
            if(ans2 == -1)  return ans1;
            
            return Math.min(ans1, cnt);
        }        
    }
    
    
    public int maximumStrongPairXor(int[] ar) {
//        if()
        return 0;
    }
}
