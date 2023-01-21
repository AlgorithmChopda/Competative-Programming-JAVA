/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class _6284 {
    
    public boolean reduce(String w1, String w2, HashMap<Character, Integer> a1, HashMap<Character, Integer> a2) {
        // reducing w1 to w2
        // find a char in w1 such that w1 has only 1 of it and w2 does contain it.
        int index = -1;
        for(int i = 0 ; i < w1.length() ; i++){
            if(a1.get(w1.charAt(i)) == 1 && a2.containsKey(w1.charAt(i)) == true)
                index = i;
        }
        if(index == -1)
            return false;
 
        // find a char in w2 such that w1 contains it more than 1 and w2 has only 1 ot it.
        for(int i = 0 ; i < w2.length() ; i++){
            if(a1.containsKey(w2.charAt(i)) && a2.get(w2.charAt(i)) > 1)
                return true;
        }
        return false;
    }
    
    public boolean increase(String w1, String w2, HashMap<Character, Integer> a1, HashMap<Character, Integer> a2){
        // increasing w2 to w1
        return true;
    }
    
    public boolean isItPossible(String w1, String w2) {
        HashMap<Character, Integer> a1 = new HashMap<>();
        HashMap<Character, Integer> a2 = new HashMap<>();
        
        for(int i  = 0 ; i < w1.length() ; i++)
            a1.put(w1.charAt(i), a1.getOrDefault(w1.charAt(i), 0) + 1) ;
        
        for(int i  = 0 ; i < w2.length() ; i++)
            a2.put(w2.charAt(i), a2.getOrDefault(w2.charAt(i), 0) + 1) ;
        
        if(a1.size() == a2.size()){
            if(w1.length() == 1 && w2.length() == 1)
                return true;
            if(w1.length() == 1 && w2.charAt(0) != w1.charAt(0))
                return false;
            if(w2.length() == 1 && w2.charAt(0) != w1.charAt(0))
                return false;
            
            return true;
        }
        
        if(Math.abs(a1.size() - a2.size()) > 1)
            return false;
        
        if(a1.size() > a2.size()){
            if(reduce(w1,w2,a1,a2))
                return true;
            /*int index = -1;
            for(int i = 0 ; i < w2.length() ; i++){
                if(a1.containsKey(w2.charAt(i)) && a2.get(w2.charAt(i)) > 1)
                    index = i;
            }
            
            if(index == -1)
                return false;
            
            int index1 = -1;
            
            for(int i = 0 ; i < w1.length() ; i++){
                if(!a2.containsKey(w1.charAt(i))  && a1.get(w1.charAt(i)) > 1)
                    return true;
            }
            
            return false;
            */
        }
        else{
            int index = -1;
            for(int i = 0 ; i < w1.length() ; i++){
                if(a2.containsKey(w1.charAt(i)) && a1.get(w1.charAt(i)) > 1)
                    index = i;
            }
            
            if(index == -1)
                return false;
            
            int index1 = -1;
            
            for(int i = 0 ; i < w2.length() ; i++){
                if(!a1.containsKey(w2.charAt(i)) && a2.get(w2.charAt(i)) > 1)
                    return true;
            }
            
            return false;
        }
        
        return true;
    }
}
