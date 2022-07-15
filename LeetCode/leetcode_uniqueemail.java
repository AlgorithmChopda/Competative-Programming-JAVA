/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class leetcode_uniqueemail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String str[] = new String[n];
        for(int i = 0 ; i < n ; i++)
            str[i] = sc.next();
        
        function(str);
    }

    public static int function(String[] emails) {
        int n = emails.length;
        HashSet<String> hs = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            boolean flag = false;
            StringBuilder str = new StringBuilder(emails[i]);

            for(int j = str.length() - 1 ; j >= 0 ; j--){
                if(flag){
                    if(str.charAt(j) == '.')
                        str.deleteCharAt(j);
                }
                else{
                    if(str.charAt(j) == '@')
                        flag = true;
                }
            }
                
            int a_index = str.lastIndexOf("@");
            int p_index = str.indexOf("+");
            str.delete(p_index, a_index);
            
            //System.out.println("\n str : "+str);
            hs.add(str.toString());
        } 
        return hs.size();
    }
}
