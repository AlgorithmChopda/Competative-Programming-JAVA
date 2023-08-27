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
public class bits {
    public static void main (String args[]) {
        int a = 10, b = 7;
//        for(long i = 1 << 30 ; i > 0 ; i /= 2) {
//            if( (a & i) != 0) System.out.print("1");
//            else System.out.print("0");
//        }
        
        while(a > 0 || b > 0) {
           if( (a & 1) == 1) System.out.println("a-> 1");
           else System.out.println("a-> 0");
           
           if( (b & 1) == 1) System.out.println("b-> 1");
           else System.out.println("b-> 0");
           
           a = a >> 1;
           b = b >> 1;
        }
    }
    
    public int minFlips(int a, int b, int c) {
        int cnt = 0;
        while(a > 0 || b > 0 || c > 0) {
            if( (c & 1) == 1) {
                // 1 is expected
                if( (a & 1) != 1 && (b & 1) != 1)   cnt++;
            }
            else {
                if( (a & 1) == 1 || (b & 1) == 1)   cnt++;
            }
            
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        
        return cnt;
    }
}