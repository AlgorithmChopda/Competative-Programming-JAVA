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
public class cf_805_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
                    
            int i = 0;
            
            for(i = 0 ; i <= 9 ; i++)
                if(Math.pow(10, i) > n)
                    break;
            System.out.println((int)(n - (int)Math.pow(10, i-1)) );
        }
    }
}
