/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _401_binary_watch {
    int get(int no) {
        char s[] = Integer.toBinaryString(no).toCharArray();
        int cnt = 0;
        for(char ch : s) {
            if(ch == '1')   cnt++;
        }
        
        return cnt;
    }
//    String getString(int i, int j) {
//        
//    }
    public List<String> readBinaryWatch(int on) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < 60 ; i++) {
            map.put(i, get(i));
        }
        
        List<String> ar = new ArrayList<>();
        for(int i = 0 ; i < 12 ; i++) {
            for(int j = 0 ; j < 60 ; j++) {
                if(map.get(i) + map.get(j) == on) {
                    String temp = "";
                    temp += "" + Integer.toString(i);
                    
                    if(j == 0)  temp += "00";
                    else temp += Integer.toString(j);
                }
            }
        }
        return null;
    }
}
