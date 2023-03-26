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
public class binarysearch_2 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           
           if(a == 0 || b == 0){
               System.out.println("0");
               continue;
           }
           
           int e = Math.min(a, b);
           int s = 0;
           boolean flag = false;
           int ans = 0;
           while(s <= e){
               // i team of 2
               int i = s + (e - s) / 2;
               System.out.println(i);
               if((long)i*2 <= a && (long)i*2 <= b) flag = true;
               if((long)i*3 <= a && i <= b)   flag = true;
               if(i <= a && (long)i*3 <= b)   flag = true;
               
               if(flag){
                   ans = i;
                   s = i+1;
                   
               }
               else{
                   e = i - 1;
               }
               
               flag = false;
            }
         
       
       System.out.println(ans);
       }
    }
}
