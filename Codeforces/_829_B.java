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
public class _829_B {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 1 , j = n ; i <= j ; i++, j--){
                if(i == j)
                    System.out.print(i);
                else
                    System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }
        
    }
}
