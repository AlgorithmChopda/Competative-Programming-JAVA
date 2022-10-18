/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

/**
 *
 * @author Vinay Jain
 */
public class geekhatestoomany1s {
    public static int noConseBits(int n) {
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(n));
        bin.reverse(); 
        for(int i = bin.length()-3 ; i >= 0 ; i--)
            if(bin.charAt(i) == '1' && bin.charAt(i+1) == '1' && bin.charAt(i+2) == '1')
                bin.setCharAt(i, '0');
        return Integer.parseInt(bin.reverse().toString(), 2);
    }
    
    public static void main(String args[]){
        int no = 2;
        System.out.println("\n "+noConseBits(no));
    }
    
}
