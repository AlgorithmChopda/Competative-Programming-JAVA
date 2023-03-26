/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class gcd_question {
    
    static int GCD(int a, int b){
        if(b == 0)  return a;
        return GCD(b, a%b);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] ar = new int[n*2 - 2];
        int index = 0;
        for(int i = 2 ; i <= n ; i++){
            ar[index++] = (-i);
            ar[index++] = i;
        }
        
        for(int ind : ar)
                System.out.print(ind + " ");
        
        int maxgcd = -1, indexA = -1, indexB = -1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < index ; j++){
                if(ar[j] == 0)  continue;
                for(int k = j+1 ; k < index ; k++){
                    if(ar[k] == 0)  continue;
                    int gcd = GCD(ar[j], ar[k]);
                    if(maxgcd < gcd){
                        maxgcd = gcd;
                        indexA = j;
                        indexB = k;
                    }
                }
            }
            
            ar[indexA] = 0;
            ar[indexB] = 0;
            
            System.out.println();
            for(int ind : ar)
                System.out.print(ind + " ");
//            System.out.println(maxgcd);
        }
           
    }
}
