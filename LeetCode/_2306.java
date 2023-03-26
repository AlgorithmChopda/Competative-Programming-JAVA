/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class _2306 {
    public long distinctNames(String[] str) {
        int n = str.length;
        HashMap<Character, HashSet<String>> map = new HashMap<>();
        ArrayList<Character> key = new ArrayList<Character>();
        for(int i = 0 ; i < n ; i++){
            char c = str[i].charAt(0);
            if(!map.containsKey(c)){
                map.put(c, new HashSet<>());
                key.add(c);
            }
            HashSet<String> temp = map.get(c);
            temp.add(str[i].substring(1));
            map.put(c, temp);
        }
        
        int ans = 0;
        for(int i = 0 ; i < key.size() ; i++){
            for(int j = i+1 ; j < key.size() ; j++){
                HashSet<String> h1 = map.get(key.get(i));
                HashSet<String> h2 = map.get(key.get(j));
                int cnt = 0;
                for(String k : h1){
                    if(h2.contains(k)){
                        cnt++;
                    }
                }
                
                ans += ((h1.size() - cnt) * (h2.size() - cnt));
            }
        }
        
        return ans;
    }
}
