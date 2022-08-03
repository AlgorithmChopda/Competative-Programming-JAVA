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
public class cf_811_c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = 45, int_cur, int_prev = 0;
        String ar[] = new String[46];
        char prev = '_', cur = '_';
        String prefix = "";
        
        for(int i = 1 ; i <= 45 ; i++){
            
            if(i <= 9){
                ar[i] = ""+i;
                continue;
            }
            
            if(i == 10){
                prev = '9';
                cur = '1';
                
                ar[i] = cur + "" + prev + "" + prefix;
                continue;
            }
            
            int_cur = cur - '0';
            int_prev = prev - '0';
            
            if(int_cur + 1 == int_prev){
                prefix = prev + "" + prefix;
                prev = cur;
                cur = '1';
                
                ar[i] = cur + "" + prev + "" + prefix;
            }
            else{
                int_cur++;
                cur = (char) (int_cur+48);
                ar[i] = cur + "" + prev + "" + prefix;
            }
              
        }
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int i = sc.nextInt();
            System.out.println(ar[i]);
        }
        
    }      
}
