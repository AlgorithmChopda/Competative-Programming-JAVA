/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class problem_3_brute {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
        
        int max = -1;
        
        for(int i = 0 ; i < n ; i++)
            for(int j = i+1 ; j < n ; j++)
                if(ar[i] == ar[j])
                    max = Math.max(i + (n-j), max);
        
        if(max == -1)
            System.out.println("Weak Array");
        else
            System.out.println(max);
    }
}
