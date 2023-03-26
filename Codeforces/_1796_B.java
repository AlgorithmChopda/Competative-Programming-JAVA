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
public class _1796_B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            
            // if first char matches
            if(a.charAt(0) == b.charAt(0)){
                System.out.println("YES");
                System.out.println(a.charAt(0)+"*");
            }
            else{
                
                // if last char matches
                if(a.charAt(a.length() - 1) == b.charAt(b.length() - 1)){
                    System.out.println("YES");
                    System.out.println("*"+a.charAt(a.length() -1));
                    continue;
                }
                
                HashSet<String> set = new HashSet<>();
                for(int i = 1 ; i < a.length() ; i++){
                    set.add(a.charAt(i-1)+""+a.charAt(i));
                }
                
                int i = 1;
                for(; i < b.length() ; i++){
                    String check = b.charAt(i-1) + "" + b.charAt(i);
                    if(set.contains(check)){
                        System.out.println("YES");
                        System.out.println("*" + check +"*");
                        break;
                    }
                }
                
                if(i == b.length()){
                    System.out.println("NO");
                }
//                int i = 1;
//                for(; i < a.length() ; i++){
//                    String match = a.charAt(i-1) + "" + a.charAt(i);
//                    boolean flag = false;
//                    for(int j = 1 ; j < b.length() ; j++){
//                        String check = b.charAt(j-1) + "" + b.charAt(j);
//                        if(match.equals(check)){
//                            System.out.println("YES");
//                            System.out.println("*"+check+"*");
//                            flag = true;
//                            break;
//                        }
//                    }
//                    if(flag)
//                        break;
//                }
//                if(i == a.length()){
//                    System.out.println("NO");
//                }
            }
        }
    }
}
