/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class _6270 {
    public int takeCharacters(String s, int k) {
        s += s;
        int ar[] = new int[3];
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.get(c).add(i);
            else
                map.put(c, new ArrayList<>());
        }
        
        ArrayList<Integer> a = map.get('a');
        ArrayList<Integer> b = map.get('b');
        ArrayList<Integer> c = map.get('c');
        
        if(a.size() < k || b.size() < k || c.size() < k)    
            return -1;
        
        int min_a = 0, max_a = k-1;
        int min_b = 0, max_b = k-1;
        int min_c = 0, max_c = k-1;
        
        int i_a = 0, i_b = 0, i_c = 0;
        int _k = k-1;
        int val = -1;
        while(true){
            int index;
            int max;// = Math.max(a.get(min_a), Math.max(b.get(min_b), c.get(min_c)));
            if(a.get(min_a) > b.get(min_b) && a.get(min_a) > c.get(min_c)){
                max = a.get(min_a);
                index = 0;
            }
            else{
                if(b.get(min_b) > c.get(min_c)){
                    index = 1;
                    max = b.get(min_b);
                }
                else{
                    index = 2;
                    max = c.get(min_c);
                }
            }
                
            
            while(min_a < a.size() && a.get(min_a) < max) min_a++;
            while(min_b < b.size() && b.get(min_b) < max) min_b++;
            while(min_c < c.size() &&c.get(min_c) < max) min_c++;
            
            if(min_a + _k >= a.size() || min_b + _k >= b.size() || min_c + _k >= c.size()) 
                return -1;
            
           int max1 = Math.max(a.get(min_a + _k), Math.max(b.get(min_b + _k) , c.get(min_c + _k)));
            
            val = Math.max(val, (max1 - max));
            
            if(index == 0)
                min_a++;
            else{
                if(index == 1)
                    min_b++;
                else
                    min_c++;
            }
            
        }
        
        //return 0;
    }
}
