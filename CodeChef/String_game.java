/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Vinay Jain
 */
public class String_game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            Stack<Character> st = new Stack<>();
            
            int cnt = 0;
            for(int i = 0 ; i < s.length() ; i++) {
                char ch = s.charAt(i);
                if(!st.isEmpty()) {
                    if(st.peek() != ch) {
                        cnt++;
                        st.pop();
                    }
                    else{
                        st.push(ch);
                    }
                } 
                else {
                    st.push(ch);
                }
            }
            
            if(cnt % 2 == 0) {
                System.out.println("Ramos");
            }
            else{
                System.out.println("Zlatan");
            }
        }
    }
}
