/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class MINSM {
    static class Solution {
        
        public int gcd(int a, int b){
            if(b == 0)
                return a;
            return gcd(b, a%b);
        }
        
        public void solve(Scanner sc){
            
            int n = sc.nextInt();
            int ar[] = new int[n];
            int _min = Integer.MAX_VALUE;
            
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                _min = Math.min(ar[i], _min);
            }
            
            if(_min == 1){
                System.out.println(n);
                return;
            }

            for(int i = 0 ; i < n ; i++){
                int _gcd = gcd(ar[i], _min);
                if(_gcd == 1){
                    System.out.println(n);
                    return;
                }   
            }
            
            System.out.println(_min * n);
       
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
