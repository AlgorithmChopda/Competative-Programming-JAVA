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
public class _6319 {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println("\n "+s);
        int even = 0;
        int odd = 0;
        for(int i = s.length() - 1 ; i >= 0; i--){
            if(s.charAt(i) == '1'){
                if(i % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        
        return new int[]{even, odd};
    }
}
