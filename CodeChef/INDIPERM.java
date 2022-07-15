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
public class INDIPERM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("1");
                continue;
            }
            System.out.print(n);
            for(int i = 0 ; i < n ; i++){
                System.out.print(" "+(i + 1));
            }
        }
    }
}
