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
public class _87 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the Month : ");
        int month = sc.nextInt();
        Object o = sc.nextInt();
        System.out.println("\n Entered Month : "+month);
        if(month <= 0 || month >= 13 )
            throw new NumberFormatException(" Month must be in the range of 1 to 12 ");
        else
            System.out.println("\n Month is valid");
    }
}
