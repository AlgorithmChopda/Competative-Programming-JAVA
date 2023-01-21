/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class array_reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = {4, 5, 1, 2};
        
        System.out.println("\n original array ");
        for(int i : ar)
            System.out.print(i+ " ");
        
        for(int i = 0 , j = ar.length-1 ; i < j ; i++, j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        
        System.out.println("\n reversed array : ");
        for(int i : ar)
            System.out.print(i+ " ");
        
        System.out.println("\n ");
             
    }
}
