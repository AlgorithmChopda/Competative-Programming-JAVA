/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class polyround_a {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            String s = sc.next(), op = "";
            boolean flag = false;
            
            if(s.charAt(0) == '0')
                flag = true;
            
            for(int i = 1 ; i < s.length() ; i++){
                    if(s.charAt(i) == '1'){
                        if(flag){
                            flag = false;
                            op += "+";
                        }
                        else{
                            flag = true;
                            op += "-";
                        }
                    }
                    else
                        op += "+";
                }
                System.out.println(op);    
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
