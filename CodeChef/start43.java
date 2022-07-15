/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class start43 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
                
            int d, d1;
            if(a >= b && a >= c){
                d = a-b;
                d1 = a-c;
            }
            else{
                if(b >= c){
                    d = b-a;
                    d1 = b-c;
                }
                else{
                    d = c-a;
                    d1 = c-b;
                }
            }
            
            System.out.println("\n d : "+d+" d1 : "+d1);
            
            HashSet<Double> hs = new HashSet<>();
            for (int i = 31; i >= 0; i--) {
		int k = d >> i;
		if ( (k & 1) == 1){
                    hs.add(Math.pow(2, i));
                    System.out.println(Math.pow(2, i)+" added in hs");
                            
                }
            }
            
            HashSet<Double> hs1 = new HashSet<>();
            for (int i = 31; i >= 0; i--) {
		int k = d1 >> i;
		if ( (k & 1) == 1){
                    hs1.add(Math.pow(2, i));
                    System.out.println(Math.pow(2, i)+" added in hs1");
                }
            }
            
            boolean flag = true;
            for(Double temp : hs){
                if(hs1.contains(temp)){
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
