/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class CONCATSORT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            int sr[] = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                sr[i] = ar[i];
            }
            
            Arrays.sort(sr);
            
            int exp_index = 0;
            int exp_ele = sr[exp_index];
            
            boolean op = false;
            for(int i = 0 ; i < n ; i++){
                if(ar[i] == exp_ele){
                    //System.out.println("Element found : "+ar[i]);
                    if(exp_index == n-1){
                        op = true;
                        break;
                    }
                    exp_index++;
                    exp_ele = sr[exp_index];
                }
            }
                        
            if(op){
                System.out.println("YES");
                continue;
            }
            
            for(int i = 0 ; i < n ; i++){
                if(ar[i] == exp_ele){
                    //System.out.println("Element found : "+ar[i]);
                    if(exp_index == n-1){
                        op = true;
                        break;
                    }
                    exp_index++;
                    exp_ele = sr[exp_index];
                }
            }
            
            if(op)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
