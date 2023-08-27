/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeMap;

/**
 *
 * @author Vinay Jain
 */
public class Biweekly_110 {
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ArrayList<Integer> ar = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
//            ar.add(temp.val);
//            temp = temp.next;
        }
        
        ArrayList<Integer> op = new ArrayList<>();
        for(int i = 1 ; i < ar.size() ; i++) {
            op.add(i - 1);
            op.add(gcd(i-1, i));
            op.add(i);
        }
        
        ListNode root = null, prev = null;
        for(int i : op) {
            if(root == null) {
//                root = new ListNode(i, null);
                prev = root;
            }
            else {
//                prev.next = new ListNode(i, null);
//                prev = prev.next;
            }
        }
        
        return root;
    }
    
    int BFS(List<Integer> ar, int max) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        
        int n = ar.size();
        for(int i = 0 ; i < n ; i++) {
            if(ar.get(i) == max) {
                q.add(i);
                set.add(i);               
            }
        }
        
        int level = 0;
        while(set.size() != n && q.isEmpty() == false) {
            int t = q.size();
            while(t-- > 0) {
                int index = q.remove();
                int left = index == 0 ? n - 1 : index - 1;
                int right = (index + 1) % n;
                
                if(!set.contains(left)) {
                    q.add(left);
                }
                if(!set.contains(right)) {
                    q.add(right);
                }
            }
            
            level++;
        }
        
        return level;
    }
    
    public int minimumSeconds(List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = ar.get(0);
        for(int i : ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > map.get(max)) {
                max = i;
            }
        }
        
        if(map.get(max) == 1) {
            return ar.size() / 2;            
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < ar.size() ; i++) {
            if(Objects.equals(map.get(ar.get(i)), map.get(max))) {
                set.add(ar.get(i));
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i : set) {
            ans = Math.min(ans, BFS(ar, i));
        }
        
        return ans;
    }
    
    
    public int minAbsoluteDifference(List<Integer> ar, int x) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = Integer.MAX_VALUE;
        
        int i = x, j = 0;
        while(i < ar.size()) {
            int ele = ar.get(i);
            map.put(ar.get(j), 0);
            Integer max = map.floorKey(ele);
            Integer min = map.ceilingKey(ele);
            
            if(max != null) {
                ans = max - ele;
            }
            if(min != null) {
                ans = min - ele;
            }
        }
        
        return ans;
    }
    
}
