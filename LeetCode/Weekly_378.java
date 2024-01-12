/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_378 {
    boolean check(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(0)) {
                return false;
            }
        }
        return true;
    }
    public int maximumLength1(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if(!check(temp))    continue;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        
        Set<String> set = map.keySet();
        int max = -1;
        for(String t : set) {
            int cnt = map.get(t);
            if(cnt >= 3) {
                max = Math.max(max, t.length());
            }
        }
        
        return max;
    }
    
    public int maximumLength(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        char ch[] = s.toCharArray();
        char prev = ch[0];
        int cnt = 0;
        
        for(int i = 0 ; i < ch.length ; i++) {
            if(ch[i] == prev) {
                cnt++;
            }
            else {
                if(!map.containsKey(prev))  map.put(prev, new ArrayList<>());
                map.get(prev).add(cnt);
                
                prev = ch[i];
                cnt = 1;
            }
            
            if(i == ch.length - 1){
                if(!map.containsKey(prev))  map.put(prev, new ArrayList<>());
                map.get(prev).add(cnt);
            }
        }
        
        
        Set<Character> temp = map.keySet();
        int max = -1;
        for(char t : temp) {
            int val = check(map.get(t));
            max = Math.max(max, val);
        }
        
        return max;
    }
    
    int check(ArrayList<Integer> ar) {
        Collections.sort(ar);
        int max = ar.get(0) - 2;
        for(int i = 2 ; i < ar.length ; i++) {
            max = Math.max(max, ar.get(i));
        }
        
        return max;
    }
}
