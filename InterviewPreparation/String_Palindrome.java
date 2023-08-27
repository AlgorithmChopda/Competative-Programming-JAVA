/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

/**
 *
 * @author Vinay Jain
 */
public class String_Palindrome {
    static boolean check(String s) {
        for(int i = 0, j = s.length() - 1 ; i < j ; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        
        return true;
    }
    static void rec(int index, String str, String input) {
        if (index == input.length()) {
            if(check(str)) {
                System.out.println(str);
            }
            
            return;
        }
        
        rec(index + 1, str + "" + input.charAt(index), input);
        rec(index + 1, str, input);
    }
    
    public static void main(String args[]) {
        String s = "1231";
        rec(0, "", s);
    }
}
