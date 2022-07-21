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
public class cf_e_132_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int key = sc.nextInt();
            int ar[] = new int[4];
            ar[0] = sc.nextInt();
            ar[1] = sc.nextInt();
            ar[2] = sc.nextInt();
            
            //System.out.println("\n ele : "+ar[key-1]);
            if(ar[key-1] != 0){
                //System.out.println("\n ele : "+ar[ar[key-1]]);
                if(ar[ar[key-1]-1] != 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}
