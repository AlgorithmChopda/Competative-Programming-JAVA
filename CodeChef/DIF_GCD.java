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
public class DIF_GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if(n == m){
                System.out.println(n+" "+m);
                continue;
            }
            
            if(n*2 > m){
                System.out.println((m-1)+" "+(m-1));
                continue;
            }
            
            int max_diff = -1;
            int ele_1 = 0, ele_2 = 0;
            
            for(int i = n ; i < m ; i++){
                int diff = (m % i);
                int ele_mult = (m - diff);
                
                int cur_diff = (ele_mult-n);
                if(cur_diff > max_diff){
                    ele_1 = i;
                    ele_2 = ele_mult;
                    max_diff = cur_diff;
                }
                
            }
            
            System.out.println(ele_1+" "+ele_2);
            
        }
    }
}
