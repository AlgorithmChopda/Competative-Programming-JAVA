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
public class cf_805_b {    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            
            int cnt = 0, size = 0;
            HashSet<Character> hs = new HashSet<>();
            for(int i = 0 ; i < str.length() ; i++){
                if(!hs.contains(str.charAt(i)))
                    size++;
                hs.add(str.charAt(i));
                
                if(size > 3){
                    size = 1;
                    cnt++;
                    hs.clear(); hs.add(str.charAt(i));
                }
            }
            
            if( size != 0)
                cnt++;
            System.out.println(cnt);
        }
    }
}
