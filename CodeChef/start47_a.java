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
public class start47_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            
            if(n == 1){
                System.out.println("YES");
                continue;
            }
         
            if(n % 2 == 0){
                System.out.println(str.substring(0, n/2)+" : "+str.substring(n/2));
                
                if(str.substring(0, n/2).equals(str.substring(n/2)))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else{
                System.out.println(str.substring(0, n/2)+" : "+str.substring(n/2, n-1));
                if(str.substring(0, n/2).equals(str.substring(n/2, n-1)) )
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
