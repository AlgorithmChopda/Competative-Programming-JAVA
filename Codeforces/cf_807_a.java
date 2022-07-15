/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_807_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ar[] = new int[2*n];
            
            for(int i = 0 ; i < 2*n ; i++){
                ar[i] = sc.nextInt();
            }
            
            Arrays.sort(ar);
            
            boolean op = true;
            for(int i = 0, j = n; j < 2*n ; i++, j++){
                if(ar[j] - ar[i] < x){
                    op = false;     break;
                }
            }
            
            if(op)
                System.out.println("YES");
            else       
                System.out.println("NO");
        }
    }
}
