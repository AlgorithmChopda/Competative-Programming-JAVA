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
public class string_compression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder op = new StringBuilder();
        
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            int j = i+1, cnt = 1;
            while(j < s.length() && s.charAt(j) == ch) {
                cnt++;  j++;
            }
            op.append(ch).append(Integer.toString(cnt));
            i = j - 1;
        }
               
        System.out.println(op);
    }        
}
