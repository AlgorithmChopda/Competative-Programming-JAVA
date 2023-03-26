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
public class _1netwon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int sum = a + b + c;
        if(sum >= 0 && sum % 2 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
                    
    }
}
