/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vinay Jain
 */
public class Biweekly_108 {
    static class Solution {
    public int alternatingSubarray(int[] ar) {
        int ans = 0;
        for(int i = 0 ; i < ar.length - 1 ; i++) {
            int j = i + 1;
            if(ar[j] - ar[i] != 1)  continue;
            int val = 1;
            for(; j < ar.length ; j++) {
                if(ar[j] - ar[j-1] != val) break;
                val = val == 1 ? -1 : 1;
            }            
            ans = Math.max(ans, j - i);
        }
        
        return ans;
    }
}
    public static void main(String args[]) {
        System.out.println(new Solution().alternatingSubarray(new int[] {4,5,6} ));
    }
    
    int op = Integer.MAX_VALUE;
    public static boolean check(long temp) {
        if (temp == 0)  return false;
        
        if(temp == 1)   return true;

        while (temp != 1) {
            if (temp % 5 != 0)  return false;
            temp /= 5;
        }

        return true;
    }
    
    void rec(int index, String s, int no) {
        if(index == -1) {
            op = Math.min(op, no);
        }
        
        int val = 0, temp = 1;
        int ans = 0;
        for(int i = index ; i >= 0 ; i--) {
            if(s.charAt(i) == '1') {
                val += temp;
            }
            temp += temp;
            
            if(check(val)) {
                rec(i - 1, s, no + 1);
            }
        }
    }
    public int minimumBeautifulSubstrings(String s) {
        rec(0, s, 0);
        
        return op;
    }
    
    
    public List<Integer> relocateMarbles(int[] ar, int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : ar) set.add(i);
        
        for(int i = 0 ; i < a.length ; i++) {
            set.remove(a[i]);
            set.add(b[i]);
        }
        
        List<Integer> op = new ArrayList<>(set);
        Collections.sort(op);
        
        return op;
    }
    
    int row, col;
    boolean isBlockFormed(int i, int j) {
       if(i + 1 <= row && j + 1 <= col) return true;
       return false;
    }
    
    public long[] countBlackBlocks(int m, int n, int[][] c) {
        row = m - 1;  col = n - 1;
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int temp[] : c) {
            int i = temp[0], j = temp[1];
            String s = i + "" + j;
            if(set.contains(s)) continue;
            set.add(s);
            if(isBlockFormed(i-1, j-1)) {
                String ar = (i - 1) + "" + (j - 1);
                if(map.containsKey(ar)) {
                    map.put(ar, map.get(ar) + 1);
                }
            }
            
            if(isBlockFormed(i-1, j)) {
                String ar = (i - 1) + "" + (j);
                if(map.containsKey(ar)) {
                    map.put(ar, map.get(ar) + 1);
                }
            }
            
            if(isBlockFormed(i, j-1)) {
                String ar = (i) + "" + (j - 1);
                if(map.containsKey(ar)) {
                    map.put(ar, map.get(ar) + 1);
                }
            }
            
            if(isBlockFormed(i, j)) {
                String ar = (i) + "" + (j);
                if(map.containsKey(ar)) {
                    map.put(ar, map.get(ar) + 1);
                }
            }
        }
        
        long block = (long)(m - 1) * (long) (n - 1);
        long op[] = new long[5];
        op[0] = block - map.size();
        
        HashMap<Integer, Integer> f = new HashMap<>();
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            int value = (mapElement.getValue());
            if(value <= 4) op[value]++;
        }
        
        return op;
        
    }
}
