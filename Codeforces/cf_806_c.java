/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_806_c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n+1];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            ArrayList<Integer> op = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                int k = sc.nextInt();
                String c = sc.next();
                for(int j = 0 ; j < k ; j++){
                    if(c.charAt(j) == 'U'){
                        if(ar[i] == 0)
                            ar[i] = 9;
                        else
                            ar[i]--;
                    }
                    else{
                        if(ar[i] == 9)
                            ar[i] = 0;
                        else
                            ar[i]++;
                    }
                }
            }
            
            for(int i = 0 ; i < n ; i++)
                System.out.print(ar[i]+" ");
            System.out.println();
        }
    }
}
