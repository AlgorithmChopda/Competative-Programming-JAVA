/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class leet_code884 {
    public static void main(String args[]){
        String s = "";
        String t = "";
        int i , j;
        StringBuilder _s = new StringBuilder();
        
        for(i = 0, j = 0 ; i < s.length()-1 && j < t.length()-1 ;){
            
            if(s.charAt(i+1) == '#' && t.charAt(j+1) == '#'){
                i += 2;
                j += 2;
            }
            else
            {
                if(s.charAt(i+1) == '#')
                    i += 2;
                if(t.charAt(i+1) == '#')
                    j += 2;
            }
            
            if(s.charAt(i) != s.charAt(j))
                return;
        }
        
       // if(i != s.length() || j != t.length())
    }
}
