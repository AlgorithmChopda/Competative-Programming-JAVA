/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class count {
    public static int countChar(String data, char ch) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : data.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        return map.get(ch);
    }
    
    public static String renovateHouses(String s) {
        String op = "";
        for(char c : s.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') continue;
            op += c;
        }
        
        return op;
    }
}
