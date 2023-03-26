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
public class binarysearch_A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        b = 240 - b;
        if(b <= 0){  
            System.out.println("0");
            return;
        }
        
        int ar[] = new int[11];
        ar[0] = 5;
        for(int i = 1 ; i < a ; i++)
            ar[i] = ar[i-1]+5;
        
        for(int i = 1 ; i < a ; i++)
            ar[i] += ar[i-1];
            
//        for(int i = 0 ; i < a ; i++)
//            System.out.print(ar[i]+" ");
        
        int s = 0, e = a-1;
//        System.out.println("\n"+s+" "+e);
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s) / 2;
//            System.out.println(mid);
            if(ar[mid] <= b){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        
        System.out.println((ans+1));
    }
}
