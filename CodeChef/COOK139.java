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
public class COOK139 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long max;
            
            if(n >= x){
                System.out.println("YES");
                continue;
            }
            
            long tra;
            if(n % 2 == 0){
                max = ((n/2)+1) * (n/2);
               
                tra = (int)(n/2)+1;
            }
            else{
                max = ((int)(n/2)+1) * (int)(n/2+1);
                
                tra = (int)(n/2);
            }
            
            if(max < x){
                System.out.println("NO");
                continue;
            }
            
            long i;
            for(i = 2 ; i <= tra ; i++)
                if(x % i == 0)
                    break;
            if(i == tra + 1)
                System.out.println("NO");
            else
                System.out.println("YES");
       }
    }
}
