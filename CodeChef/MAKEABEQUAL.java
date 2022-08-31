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
public class MAKEABEQUAL {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt(), sum_a = 0, sum_b = 0;
            int ar[] = new int[n];
            int br[] = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                sum_a += ar[i];
            }
            for(int i = 0 ; i < n ; i++){
                br[i] = sc.nextInt();
                sum_b += br[i];
            }
            
            if(sum_a != sum_b){
                System.out.println("-1");
                return;
            }
            
            int ans = 0;
            for(int i = 0 ; i < n ; i++)
                ans += Math.abs(ar[i] - br[i]);
            
            System.out.println((ans/2)); 
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
