/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_807_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        ArrayList<Integer> ar = new ArrayList<>();
        Collections.sort(ar);
       
        
        
        while(t-- > 0){
            int n = sc.nextInt();
            long cnt_0 = 0;
            boolean num_value = false;
            long sum = 0;
            
            for(int i = 0 ; i < n ; i++){
                int temp = sc.nextInt();
                
                if(i == n-1) // last element
                    break;
                
                if(temp == 0){
                    if(!num_value)
                        continue;
                    cnt_0++;
                }
                
                if(temp >= 1){
                    num_value = true;
                    sum += temp;
                }
            }
            
            System.out.println( (sum+cnt_0) );
        }
    }
}
