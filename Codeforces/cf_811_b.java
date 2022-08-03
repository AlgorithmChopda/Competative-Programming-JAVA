/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_811_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int n = sc.nextInt();
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            HashSet<Integer> hs = new HashSet<>();
            int i = -1;
            for(i = n-1 ; i >= 0 ; i--){
                if(hs.contains(ar[i]))
                    break;
                hs.add(ar[i]);
            }
            
            System.out.println(i+1);
            
        }
        
                    
    }
}
