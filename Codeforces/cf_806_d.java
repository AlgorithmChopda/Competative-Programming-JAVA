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
public class cf_806_d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            String str[] = new String[n];
            HashSet<String> hs = new HashSet<>();
            for(int i = 0 ; i < n ; i++){
                str[i] = sc.next();
                hs.add(str[i]);
            }

            HashSet<String> hs1 = new HashSet<>();
            for(int i = 0 ; i < n ; i++){
                int length = str[i].length();
                boolean flag = false;
                for(int j = 1 ; j < length ; j++){
                    if(hs.contains(str[i].substring(0, j)) && hs.contains(str[i].substring(j, length)                    )){
                        System.out.print("1");
                        flag = true;
                        break;
                    }
                }
                 if(!flag)
                        System.out.print("0");
            }

            /*boolean flag;
            for(int i = 0 ; i < n ; i++){
                for(int j = i ; j < n ; j++){
                    hs1.add(str[i]+str[j]);
                    hs1.add(str[j]+str[i]);  
                }
            }
            
            for(int i = 0 ; i < n ; i++){
                if(hs1.contains(str[i]))
                    System.out.print("1");
                else
                    System.out.print("0");
            }*/
            
            System.out.println();
        }
    }
}
