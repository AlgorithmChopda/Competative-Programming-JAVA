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
public class ORANDCON {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            String val = Integer.toBinaryString(x);
            int a = Integer.parseInt("1"+val, 2);
            int b = (x >> 1);
            int c = x+0;
            System.out.println(b+" "+c+" "+a);
        }
    }
}
