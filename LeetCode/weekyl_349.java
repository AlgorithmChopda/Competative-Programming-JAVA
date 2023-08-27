/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class weekyl_349 {
    String lower(String s, int index) {
        StringBuilder st = new StringBuilder(s);
        for(int i = index ; i < s.length() ; i++) {
            char ch = st.charAt(i);
            st.setCharAt(i, ch--);
        }
        
        return st.toString();
    }
    public String smallestString(String s) {
        StringBuilder t = new StringBuilder(s);
        boolean a = false;
        for(int i = 0 ; i < s.length() ; i++) {
            if(t.charAt(i) != 'a') {
                int ch = (int) t.charAt(i);   ch--;
                t.setCharAt(i, (char) ch);
                a = true;
            }
            else {
                if(!a)  return t.toString();
            }
        }
        
        if(!a)  return t.toString();
        
        t.setCharAt(t.length() - 1, 'z');         
        return t.toString();
    }
    
    
    class SnapshotArray {
    ArrayList<HashMap<Integer, Integer>> ar[];
    int snapCount = 0;
    public SnapshotArray(int length) {
        ar = new ArrayList[length];
        for(int i = 0 ; i < length ; i++) {
            ar[i] = new ArrayList<>();
            ar[i].add(new HashMap<>());
        }
    }
    
    public void set(int index, int val) {
        ar[index].get(0).put(snapCount, val);
    }
    
    public int snap() {
        return snapCount++;
    }
    
    public int get(int index, int snap_id) {
        return ar[index].get(0).get(snap_id);
    }
}
    
    
    
    
    static int scoreAndCost(int n, int []ar, int []b, int x) {
        // cost value
        PriorityQueue<int []> pq = new PriorityQueue<>( (a, b1) -> {
            if(a[0] == b1[0])  return a[1] - b1[1];
            return a[0] - b1[0];
        });
        
        for(int i = 0 ; i < n ; i++) {
            pq.add(new int[] {b[i], ar[i]});
        }
        
        ArrayList<int []> t = new ArrayList<>(pq);

        int sum = 0;
        int value = -1;
        int index = -1;
        boolean flag = false;
        
        while(sum < x && pq.isEmpty() == false) {
            int temp[] = pq.remove();
            sum += temp[1];
            index++;
            
            if(sum >= x)  {  
                flag = true;
                break;
            }
            value = temp[0];
        }
        
        // index will point to last element that makes the required sum
        // sum 
        if(!flag)   return -1;
        
//        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ele = new ArrayList<>();
        for(int i = index ; i < n ; i++) {
            ele.add(t.get(i)[1]);
        }
        
        Collections.sort(ele);
        int last = ele.get(ele.size() - 1);
        sum = 0;
        for(int i = 0 ; i < index ; i++) {
            sum += t.get(i)[1];
            if(sum + last >= x) {
                value = Math.min(value, t.get(i)[0]);
                break;
            }
        }
        
        return value;
        
    }
    
    
    
}
