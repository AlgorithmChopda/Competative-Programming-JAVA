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
public class ARRAYBREAK {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n], odd = 0;
            boolean flag = false;
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(ar[i] % 2 != 0){
                    flag = true;
                    odd++;
                }
            }
            
            if(flag)  // atleast 1 odd
                System.out.println(n - odd);
            else
                System.out.println(0);
            
        }
    }
}
