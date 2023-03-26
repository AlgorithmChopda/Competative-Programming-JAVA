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
public class _1793_C {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
            }
            
            int i = 2;
            for(; i < n ; i++ ){
                if(ar[i-2] > ar[i-1] && ar[i] > ar[i-2]){
                    System.out.println( (i-1) +" " + (i+1) );
                    break;
                }
            }
            
            if(i == n){
                System.out.println("NO");
            }
        }
    }        
}
