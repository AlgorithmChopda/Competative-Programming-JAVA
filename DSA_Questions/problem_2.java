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
public class problem_2 {
    
    public static void main(String args[]){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cur[] = new int[n];
        long sum = 0;
        for(int i = 0 ; i < n ; i++){
            cur[i] = sc.nextInt();
            sum += cur[i];
        }
        
        int rem[] = new int[n];
        long max1 = -1, max2 = -1;
        for(int i = 0 ; i < n ; i++){
            rem[i] = sc.nextInt();
            if(max1 < rem[i]){
                max2 = max1;
                max1 = rem[i];
            }
            else
                max2 = Math.max(rem[i], max2);
        }
        
        if(max1 + max2 >= sum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
