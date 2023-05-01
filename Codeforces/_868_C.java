/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

/**
 *
 * @author Vinay Jain
 */
public class _868_C {
    
    static boolean isPrime(int no) {
        if(no == 1) return false;
        for(int i = 2 ; i*i <= no ; i++) {
            if(no % i == 0) return false;
        }
        
        return true;
    }
    static void print(int no) {
        int prime = 0;
        int com = 0;
        for(int i = 1 ; i <= no ; i++) {
            if(no % i == 0) {
                if(isPrime(i))  prime++;
                else    com++;
            }
        }
        
        if(prime < com)
            System.out.println(no);//+" : "+prime+" : "+com +" strongly composite");
//        else
//            System.out.println(no+" : "+prime+" : "+com);
        
    } 
    public static void main(String args[]) {
        for(int i = 1 ; i <= 1000 ; i++) {
            print(i);
        }
    }         
}
