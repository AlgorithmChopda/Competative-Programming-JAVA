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
public class cf_e_132_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        
        int ar[] = new int[n];
        
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
        
        long pos[] = new long[n];
        long neg[] = new long[n];
        
        pos[n-1] = 0;
        for(int i = n-2 ; i >= 0 ; i--){
            pos[i] = pos[i+1];
            if(ar[i] > ar[i+1])
                pos[i] += (ar[i] - ar[i+1]);
        }
        
        neg[0] = 0;
        for(int i = 1 ; i < n ; i++){
            neg[i] = neg[i-1];
            if(ar[i] > ar[i-1])
                neg[i] += (ar[i] - ar[i-1]);
        }
        
        for(int i = 0 ; i < t1 ; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            if(start < end)
                System.out.println(pos[start-1]-pos[end-1]);
            else
                System.out.println(neg[start-1]-neg[end-1]);
        }
        
    }
}
