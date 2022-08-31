/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6157_time {
    class Solution {
        public int secondsToRemoveOccurrences(String s) {
            StringBuilder s1 = new StringBuilder(s);
            boolean next = true;
            int cnt = 0;
            while(true){
                next = false;
                StringBuilder s2 = new StringBuilder(s1);
                for(int i = 1 ; i < s2.length(); i++){
                    if(s1.charAt(i-1) == '0' && s1.charAt(i) == '1'){
                        next = true;
                        System.out.println("found at "+i);
                        s2.setCharAt(i-1, '1');
                        s2.setCharAt(i, '0');
                    }
                }
                s1 = s2;
                cnt++;
                if(!next)
                    break;
            }
            return cnt;
        }
    }
}
