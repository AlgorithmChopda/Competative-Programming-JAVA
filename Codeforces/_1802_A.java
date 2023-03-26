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
public class _1802_A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int pos = 0, neg = 0;
            for(int i = 0 ; i < n ; i++){
                int val = sc.nextInt();
                if(val >= 1)    pos++;
                else    neg++;
            }
            
            // printing max part
            for(int i = 1 ; i <= pos ; i++){
                System.out.print(i+" ");
            }
            for(int i = 1 ; i <= neg ; i++){
                System.out.print((pos-i)+" ");
            }
            
            // printing min part
            System.out.println();
            for(int i = 1 ; i <= Math.min(pos, neg) ; i++){
                System.out.print("1 0 ");
            }
            int val = Math.min(pos, neg) * 2;
            for(int i = 1 ; (i+val) <= n ; i++){
                System.out.print(i+" ");
            }
            
            System.out.println();
        }
    }
}
