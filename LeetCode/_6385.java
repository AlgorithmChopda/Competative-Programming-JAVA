/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Vinay Jain
 */
public class _6385 {
     public int minMaxDifference(int num) {
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar1 = new ArrayList<>();
        int t = num;
        while(num > 0){
             int r = t % 10;
             ar.add(r);
             t /= 10;
        }
        
        Collections.reverse(ar);
        int s = ar.get(0);
        int i = 1;
        int max = 0;
        while(s == ar.get(i)){
            
        }
        
        return 0;
     }
}
