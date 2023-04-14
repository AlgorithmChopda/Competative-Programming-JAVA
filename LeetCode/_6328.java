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
public class _6328 {
    public int maximumCostSubstring(String s, String c, int[] vals) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < c.length() ; i++) {
            map.put(c.charAt(i), i+1);
        }
        
        
        int curSum = 0;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int ch = s.charAt(i);
            if(map.containsKey(ch)){
                curSum += map.get(ch);
            }
            else{
                curSum += ((ch - 'a') + 1);
            }
            
            max = Math.max(max, curSum);
            if(curSum < 0){
                curSum = 0;
            }
             
            System.out.println(curSum);
                    
        }
        
        return max;
    }
}
