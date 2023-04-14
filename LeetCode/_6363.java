/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _6363 {
    public List<List<Integer>> findMatrix(int[] ar) {
        List<List<Integer>> op = new ArrayList<>();
        int n = ar.length;
        int m = ar[0];
        for(int i = 1 ; i < n ; i++){
            m = Math.max(m, ar[i]);
        }
        
        int f[] = new int[m+1];
        
        
        for(int i = 0 ; i < n ; i++){
            f[ar[i]]++;
        }
        
        while(true){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i <= m ; i++){
                if(f[i] > 0){
                    temp.add(i);
                    f[i]--;
                }
            }
            
            if(temp.size() != 0){
                op.add(temp);
            }
            else{
                break;
            }
        }
        
        return op;
    }
}
