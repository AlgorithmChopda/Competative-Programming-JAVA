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
public class cf_806_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){ 
            String str = sc.next();
            if(str.equalsIgnoreCase("yes"))
                System.out.println("YES");
            else
                System.out.println("NO"); 
        }
    }
}
