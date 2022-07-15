/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class PRIMESM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            boolean a_2,a_3, b_2, b_3;
            a_2 = a_3 = b_2 = b_3 = false;
            
            if(a >= 5 && b >= 5){
                System.out.println("0");
                continue;
            }
            
            if(a == 2 && b == 3){
                System.out.println("1");
            }
            
            if(a == 3 && b == 2){
                System.out.println("1");
            }
            
            
            if(a == 1 || b == 1){
                System.out.println("-1");
                continue;
            }
            
            if(a == 2)
                a_2 = true;
            else{
                int rem = (int) (a % 3);
                
                if(rem == 0){
                    a_3 = true;
                    if(a >= 6)
                       a_2 = true;
                }
                
                if(rem == 1){
                    a_2 = true;
                    if(a > 4)
                        a_3 = true;
                }
                
                if(rem == 2){
                    a_2 = true;
                    a_3 = true;
                }
            }
            
        
            if(b == 2)
                b_2 = true;
            else{
                int rem = (int) (b % 3);
                
                if(rem == 0){
                    b_3 = true;
                    if(b >= 6)
                       b_2 = true;
                }
                
                if(rem == 1){
                    b_2 = true;
                    if(b > 4)
                        b_3 = true;
                }
                
                if(rem == 2){
                    b_2 = true;
                    b_3 = true;
                }
            }
            
            
            if( (a_2 && b_2) || (a_3 && b_3) )
                System.out.println("0");
            else
                System.out.println("1");

        }
    }   
}
