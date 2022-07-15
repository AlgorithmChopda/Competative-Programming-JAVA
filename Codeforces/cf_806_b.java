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
public class cf_806_b {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            
            HashSet<Character> hs = new HashSet<>();
            
            int cnt = 0;
            for(int i = 0 ; i < n ; i++){
                if(hs.contains(str.charAt(i)))
                    cnt++;
                else
                    cnt += 2;
                hs.add(str.charAt(i));
            }
            System.out.println(cnt);
        }
    }
}
