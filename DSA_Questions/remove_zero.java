/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    given a no print it after removing the zeros
    eg :
            no = 20405
            o/p = 245
*/
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class remove_zero {
    public static void Sol(Scanner sc){
        int n = sc.nextInt();
        int op = 0, r = 0, mult = 1;
        
        while(n > 0){
            r = n % 10;     n /= 10;
            if(r != 0){
                op = r * mult + op;
                mult *= 10;
            }
        }
        
        System.out.println("\n "+op);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            Sol(sc);
    }       
}
