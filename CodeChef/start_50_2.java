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
public class start_50_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            for(int i = n ; i > 0 ; i -= 2)
                System.out.print(i+" ");
            int start = 2;
            if(n % 2 == 0)
                start = 1;
            
            for(int i = start ; i <= n-1 ; i += 2)
                System.out.print(i+" ");
            System.out.println();
        }
        
        
    }   
}
