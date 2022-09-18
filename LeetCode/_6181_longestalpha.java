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
public class _6181_longestalpha {
    class Solution {
        public int longestContinuousSubstring(String s) {
                 if(s.length() == 1)
                    return 1;
                int max = 0, cnt = 0;
                for(int i = 0 ; i < s.length()-1 ; i++){
                    if(s.charAt(i) < s.charAt(i+1) && (s.charAt(i+1) - s.charAt(i)) == 1)
                        cnt++;
                    else{
                        max = Math.max(cnt+1, max);
                        cnt = 0;
                    }
                }
                return Math.max(Math.max(max, cnt+1), 1);
        }
    }
}
