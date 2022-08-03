/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_811_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int hr = sc.nextInt();
            int min = sc.nextInt(); //min++;
            
            int time = (hr*60) + (min);
            int diff = Integer.MAX_VALUE;
            boolean change = false;
            int minimum = Integer.MAX_VALUE;
            
            
            for(int i = 0 ; i < n ; i++){
                int h = sc.nextInt();
                int m = sc.nextInt();
                //m++;
                
                int cur_time = (h*60) + m;
                int _diff = cur_time - time;
                
                if(_diff >= 0){
                    diff = Math.min(diff, _diff);
                    change = true;
                }
                
                minimum = Math.min(minimum, cur_time);
                
            }
            
            if(!change)
                diff = (1440 - time) + minimum;
            System.out.println( (diff/60) + " " + (diff%60) );
            
        }
        
        
    }
}
