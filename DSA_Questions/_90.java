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

class divideBy0Exception extends Exception {
    public divideBy0Exception() {
        super(" valud of (b*d) is ZERO .....\n a number cannot be divided by 0");
    }
}

public class _90 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter a, b, c and d : ");
        int a = sc.nextInt();   int b = sc.nextInt();
        int c = sc.nextInt();   int d = sc.nextInt();
        
        try{
            if( b*d == 0 )
                throw new divideBy0Exception();
            System.out.println("\n "+( ((a+d) + (b*c))/ (b*d) ));
        }
        catch(divideBy0Exception e){
            System.out.println("\n Exception : \n "+e);
        }
    }
}
