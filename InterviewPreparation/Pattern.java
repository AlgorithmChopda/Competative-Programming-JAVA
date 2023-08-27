/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class Pattern {
    
    void prime(int n) {
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, false);
        
        for(int i = 2 ; i * i <= n ; i++) {
            if(isPrime[i]){
                for(int j = i * i ; j <= n ; j += i) {
                    isPrime[i] = false;
                }
            }
        }
    }
    
    public static void main(String args[]) {
        int val = 1;
        int n = 3;
        int cnt = 1;
        
        String ar[] = new String[n];
        
        for(int i = 1 ; i <= n ; i++) {
            String temp = "";
            for(int j = 1 ; j < cnt ; j++) {
                temp += "" + val + "*";
                System.out.print( (val++) + "*");
            }
            temp += "" + val;
            System.out.print( (val++) );
            cnt++;
            System.out.println();
            
            ar[i - 1] = temp;
            temp = "";
        }
        
        int end = val - 1;
        int start = val - n;
        for(int i = n ; i >= 1 ; i--) {
            for(int j = start ; j < end ; j++) {
                System.out.print(j+"*");
            }
            System.out.print(end);
            int a = start;
            start = start - (end - start);
            end = a - 1;
            System.out.println();
        }
    }
}
