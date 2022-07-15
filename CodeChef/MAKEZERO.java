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
public class MAKEZERO {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long ar[] = new long[(int)n];
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextLong();
            
            int count = 0;
            long power = 1073741824;
            while(power > 0){
                boolean flag = false;
                for(int i = 0 ; i < n ; i++)
                {
                    if(ar[i] >= power){
                        ar[i] -= power;
                        flag = true;
                    }
                }
                if(flag == true){
                    System.out.println("\n power : "+power);
                    count++;
                    
                }
                power /= 2;
            }  
            
            System.out.println("\n Count : "+count);
        }
    }
}
