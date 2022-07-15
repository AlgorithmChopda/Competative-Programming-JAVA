/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class leetcode_6070 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        
        while(s.length() > k){
            String str = "";
            for(int i = 0 ; i < s.length() ; i += k){
                int sum = 0;
                for(int j = 0 ; j < k && (i+j) < s.length() ; j++)
                    sum += s.charAt(i+j) - '0';
                str += sum;
                System.out.println("sum : "+sum);
            }
            s = str;
            System.out.println("str : "+str);
        }
    }
}
