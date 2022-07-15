/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class june221 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if( a == b )
                System.out.println(a);
            else{
                long diff = Math.abs(a - b);
                if(Math.min(a, b) < diff)
                    System.out.println("-1");
                else
                    System.out.println(Math.max(a, b)+1);
            }
        }
    }
}
