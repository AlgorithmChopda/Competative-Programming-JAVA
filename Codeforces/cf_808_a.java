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
public class cf_808_a {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            int ele = sc.nextInt();
            boolean flag = false;
            for(int i = 1 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(!flag){
                    if(ar[i] % ele != 0)
                        flag = true;
                }
            }
            
            if(flag == true)
                System.out.println("NO");
            else
                System.out.println("YES");
            
            
            /*if(n == 2){
                if(ar[1] - ar[0] == ar[0])
                    System.out.println("YES");
                else
                    System.out.println("NO");
                continue;
            }
            
            boolean flag = true;
            int last = ar[1] - ar[0];
            for(int i = 2 ; i < n-1 ; i++){
                if(ar[i] - ar[i-1] != last){
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            */
        }    
    }
}
