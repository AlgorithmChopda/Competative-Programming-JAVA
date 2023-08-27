/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class String_Decompress {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "321c1";
        
        String op = "";
        char currentChar = '$';
        for(char ch : s.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                // skip 
                if(currentChar == '$')  continue;
                
                while(ch != '0') {
                    op += currentChar;
                    ch--;
                }
            }
            else {
                currentChar = ch;
            }
        }
        if(op.isEmpty()) {
            System.out.println("-1");
        }
        else {
            System.out.println(op);
        }   
    }
}
