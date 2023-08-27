/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

/**
 *
 * @author Vinay Chopda
 */
public class temp {
    static String list[];
    static int ans = Integer.MAX_VALUE;
    
    static void rec(int index, String given, String curr) {
        if(index == given.length())  {
            if(!curr.startsWith("0") && !curr.equals("")) {
               for(String temp : list) {
                   if(temp.startsWith(curr)) {
                       int opr = (temp.length() - curr.length()) + (given.length() - curr.length());
                       ans = Math.min(ans, opr);
                       break;
                   }
               } 
               
                System.out.println();
            }
        }
        else{
            rec(index + 1, given, curr);
            rec(index + 1, given, curr + given.charAt(index) + "");
        }
    }
    static void powerOf2(int no) {
        list = new String[30];
        for(int i = 1 ; i < 31 ; i++) {
            String temp = Integer.toString((int)Math.pow(2, i));
            list[i - 1] = temp;
        }
        
        rec(0,Integer.toString(no), "");
        
        System.out.println(ans);
    }
    public static void main(String args[]) {
        powerOf2(1024);
    }
}
