/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class _6169_longestnice {
    class Solution {
        public int longestNiceSubarray(int ar[]) {
            int length = 1, cur_length = 1;
            int map[] = new int[32];
            boolean flag = false;
            
            for(int i = 0 ; i < ar.length ; i++){
                String str = Integer.toBinaryString(ar[i]);
                for(int j = 0 ; j <= 31 ; j++){
                    if(str.charAt(j) == '1'){
                        if(map[j] != 1)
                            map[j] = 1;
                        else{
                            flag = true;
                            Arrays.fill(map, 0);
                            for(int k = 0 ; k <= 31 ; k++){
                                if(str.charAt(k) == '1')
                                    map[k] = 1;
                                else
                                    map[k] = 0;
                            }
                            break;
                        }
                    }
                }
                
                if(!flag)
                    cur_length++;
                else
                    length = Math.max(length, cur_length);
                flag = false;
            }
            return Math.max(length, cur_length);
        }
    }
}
