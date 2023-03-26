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
public class _6312 {
    public static  int splitNum(int n) {
                       
        int t = n;
        ArrayList<Integer> ar = new ArrayList<>();
        while(t > 0) {
            ar.add(t%10);
            t /= 10;
        }
       
        Collections.sort(ar);
        
        int i = 0;
        while(ar.get(i) == 0){    
            i++;            
        }
        int ans = 0;
        
        int j = i + 1;
        int no = 0;
        for(; i < ar.size() ; i+=2){
            no = no * 10 + ar.get(i);
        }
        
        int no1 = 0;
        for(; j < ar.size() ; j+=2){
            no1 = no1 * 10 + ar.get(j);
        }

        System.out.println(no+" "+no1);
        return 0;
    }

    long que2(int n){
        long val = 4;
        long ans = 1;
                
        for(int i = 2 ; i <= n ; i++){
            ans += val;
            val += 4;
        }   
        
        return ans;
    }
    
    public static void main(String args[]){
        splitNum(687);
    }
}



